package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Category;
import com.example.demo.entity.Order;
import com.example.demo.entity.OrderItem;
import com.example.demo.entity.Product;

@RestController
public class Controller {
    ArrayList<Product> products = new ArrayList<>();
    ArrayList<Category> categories = new ArrayList<>();
    ArrayList<Order> orders=new ArrayList<>();
    ArrayList<OrderItem> orderItems=new ArrayList<>();
    int orderId=0;

    @PostMapping("/addNewProduct")
    public String addProduct(@RequestBody Product p) {
        products.add(p);
        return "The product added succeflly";

    }

    @GetMapping("/menu")
    public ArrayList<Product> getProducts()
    {
        return products;
    }
    
   @GetMapping("/getItemById/{id}")
public ResponseEntity<Product> getItemById(@PathVariable int id) {
    return products.stream()
            .filter(p -> p.getId() == id)
            .findFirst() 
            .map(product -> ResponseEntity.ok(product)) 
            .orElse(ResponseEntity.notFound().build()); // لو مش موجود هترجع 404
}
    @PostMapping("/addCategory")
    public String addCategory(@RequestBody Category category)
    {
        categories.add(category);
        return ("new category "+category.getName()+" added succefully");
    }
      
     @GetMapping("/getCategories")
    public ArrayList<Category> getCategories()
    {
        return categories;
    }

    @PostMapping("/addOrder")
    public String addOrder(@RequestBody  ArrayList<OrderItem> orderItems)
    {
        orderId++;
        Order order =new Order( orderId,orderItems,"PREPARING");
        orders.add(order);
        return ("new order added succefully");
    }

    @PostMapping("/addOrderItem")
    public String addOrderItem(@RequestBody int itemId,int quantity)
    {
        if(products)
        Order order =new Order( orderId,orderItems,"PREPARING");
        orders.add(order);
        return ("new order added succefully");
    }




    @GetMapping("/getAllOrders")
    public ArrayList<Order> getAllOrders()
    {
        return orders;
    }

   @GetMapping("getOrderById")
public ResponseEntity<Order> getOrderById(@RequestParam int id) {
    
    return orders.stream()
            .filter(o -> o.getId() == id)
            .findFirst()
            .map(ResponseEntity::ok) 
            .orElse(ResponseEntity.notFound().build()); 
}
}
