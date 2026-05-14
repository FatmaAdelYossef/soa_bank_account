package org.example;

import java.util.ArrayList;

public class Cart {
private final ArrayList<Product> products=new ArrayList<>(); 
public void showCartProducts()
{
    if(products.isEmpty())
    {
           System.out.println("No products recorded yet.");
    }else{
        for(Product p:products)
        {
            p.showProduct();
        }
    }
}
public void addProduct(Product product)
{
    products.add(product);
}

public void calculatePrice()
    {
    double totalPrice=0;
     for(Product p:products)
        {
           totalPrice+=p.price;
        }
        System.out.println("\nThe total cost for all products in cart is : "+totalPrice);

    }

}
