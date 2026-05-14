package org.example;

public class Product {
    int id;
    String name;
    double price;
    public Product(int id, String name, double price) {
        this.name = name;
        this.price = price;
        this.id = id;

    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;   }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}