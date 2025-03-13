package vn.edu.iuh.fit.dhktpm17a.compositedesignpattern;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoffeeShopBillingApplication {

    public static void main(String[] args) {
        Product coffee = new Product("Cà phê", 30.0, 2);
        Product tea = new Product("Trà sữa", 40.0, 1);
        Product water = new Product("Nước suối", 10.0, 3);

        
        Table table1 = new Table(1, "Bàn 1", "Tầng 1");
        table1.addItem(coffee);
        table1.addItem(tea);

        Table table2 = new Table(2, "Bàn 2", "Tầng 1");
        table2.addItem(water);
        table2.addItem(coffee);

        Area floor1 = new Area("Tầng 1");
        floor1.addTable(table1);
        floor1.addTable(table2);

        CoffeeShop shop = new CoffeeShop();
        shop.addArea(floor1);

        // report
        Report.printSummary(shop);
    }
}
