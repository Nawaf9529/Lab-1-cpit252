package org.example;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Product p1 = new FoodProduct(6745, 5.50, "Penne Pasta",200.20,LocalDate.parse("2029-09-19"));
        Product p2 = new FoodProduct(8853, 6.50, "Spaghetti Pasta",300,LocalDate.parse("2030-06-23"));
        Product p3 = new FoodProduct(2106, 4.50, "Linguine Pasta",320,LocalDate.parse("2023-12-06"));
        System.out.println("Total Quantity: " + p3.getTotalQuantity());

        Product p4 = new FoodProduct(1234, 9.99, "water",125,LocalDate.parse("2045-01-08"));
        FoodProduct p5 = new FoodProduct(3452, 10.0, "Cheddar Cheese",270,
                LocalDate.parse("2022-06-07"));
        ElectricProduct p6 = new ElectricProduct(4875, 30.0, "Extension cord",210, "220v");
        
        Product[] products={p1,p2,p3,p4,p5,p6};
        
        for(Product p :products){
            System.out.println(p);
        }
        
       //set wight of p1 to 200
        p1.setWeight(200);
    }
}
