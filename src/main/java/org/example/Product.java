package org.example;

public abstract class Product {
    private int id;
    private double price;
    private String name;
    private static int quantity;
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight<0) {
            throw new IllegalArgumentException("invaild weight value");
        }
        this.weight = weight;
    }
    
    public Product(int id, double price, String name,double weight){
        this.id = id;
        this.price = price;
        this.name = name;
        this.weight=weight;
        quantity ++;
    }
    public void applySaleDiscount(double percentage){
        this.price = this.price - ((percentage/100) * this.price);
    }

    public final void addToShoppingCart(){
        System.out.println(this.name + " has been added to the shopping cart.");
    }

    public int getTotalQuantity(){
        return this.quantity;
    }

    public abstract void getSellableStatus();

    public String toString(){
        return "Product info:\n+Id: " + this.id + "\t" + "name: " + this.name +
                "\tPrice: SR" + this.price;
    }
}
