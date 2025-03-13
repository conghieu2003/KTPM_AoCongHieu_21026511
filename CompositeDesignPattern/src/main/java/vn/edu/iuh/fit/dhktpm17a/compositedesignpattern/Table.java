package vn.edu.iuh.fit.dhktpm17a.compositedesignpattern;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Table implements BillComponent {
    private int id;
    private String name;
    private String location;
    private List<BillComponent> items = new ArrayList<>();

    public Table(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public void addItem(BillComponent item) {
        items.add(item);
    }

    public double getTotalPrice() {
        return items.stream().mapToDouble(BillComponent::getTotalPrice).sum();
    }


}
