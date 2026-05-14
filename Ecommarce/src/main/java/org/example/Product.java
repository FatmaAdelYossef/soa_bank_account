package org.example;

public class Product {
String name;
String color;
double price;
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getColor() {
    return color;
}
public void setColor(String color) {
    this.color = color;
}
public double getPrice() {
    return price;
}
public void setPrice(double price) {
    this.price = price;
}
public Product(String name,String color,double price){
setColor(color);
setName(name);
setPrice(price);
}
public void showProduct(){
    System.out.println("Name of product : "+ name);
    System.out.println("color chosen : "+color);
    System.out.println("Price: "+price);
}

}
