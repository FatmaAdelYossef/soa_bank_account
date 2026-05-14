package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user1=new User("ahmed","24564gdgd");
        Product product1=new Product("handBag", "red", 13.0);
        Product product2=new Product("toti", "green", 135.0);

        user1.cart.addProduct(product1);
        user1.cart.addProduct(product2);
        user1.cart.showCartProducts();
        user1.cart.calculatePrice();

    }
}