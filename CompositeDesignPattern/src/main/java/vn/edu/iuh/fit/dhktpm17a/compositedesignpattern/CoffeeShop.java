package vn.edu.iuh.fit.dhktpm17a.compositedesignpattern;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
    private List<Area> areas = new ArrayList<>();

    public void addArea(Area area) {
        areas.add(area);
    }

    public double getTotalRevenue() {
        return areas.stream().mapToDouble(Area::getTotalPrice).sum();
    }
}
