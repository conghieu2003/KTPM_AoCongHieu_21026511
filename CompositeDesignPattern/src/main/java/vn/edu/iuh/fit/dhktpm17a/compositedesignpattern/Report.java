package vn.edu.iuh.fit.dhktpm17a.compositedesignpattern;

public class Report {
    public static void printSummary(CoffeeShop shop) {
        System.out.println("Tổng doanh thu của quán: " + shop.getTotalRevenue() + "00đ");
    }
}
