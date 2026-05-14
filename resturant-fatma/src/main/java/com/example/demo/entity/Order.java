package com.example.demo.entity;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;


public class Order {
    private int id;
    private LocalDateTime orderDate;
    private List<OrderItem> items = new ArrayList<>();
    private String status;

     public Order() {
    }
    public Order(int id, List<OrderItem> items, String status) {
        this.id = id;
        this.orderDate = LocalDateTime.now();
        this.items = items;
        this.status = status;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


  public double getTotalPrice() {
    return items.stream()
                .mapToDouble(item -> item.getPrice() * item.getQuantity())
                .sum();
}
}