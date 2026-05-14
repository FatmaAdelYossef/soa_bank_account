package org.example;

public class OrderItem {
    int id;
    String name;
    double price;
    int quantity;
    public OrderItem() {
    }
    public OrderItem( String name, double price, int quantity) {
        id++;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
}
