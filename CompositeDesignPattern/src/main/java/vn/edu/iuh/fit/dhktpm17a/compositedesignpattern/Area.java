package vn.edu.iuh.fit.dhktpm17a.compositedesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Area implements BillComponent {
    private String name;
    private List<Table> tables = new ArrayList<>();

    public Area(String name) {
        this.name = name;
    }

    public void addTable(Table table) {
        tables.add(table);
    }

    public double getTotalPrice() {
        return tables.stream().mapToDouble(Table::getTotalPrice).sum();
    }
}
