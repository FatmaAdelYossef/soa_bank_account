package com.example.demo.entity;

public class Product {
    int id;
    String name;
    double price;
    int CategoryId;
    public Product(int id, String name, double price, int CategoryId) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.CategoryId=CategoryId;

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
