package com.coforge.day4assignment;

import java.util.ArrayList;

public class Cart {

    ArrayList<Product> products = new ArrayList<>();

   
    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }


    public void calculateBill() {

        double total = 0;

        for (Product product : products) {
            total = total + product.getPrice();
        }

        System.out.println("Total Bill = " + total);
    }

    
    public void displayProducts() {

        for (Product product : products) {
            System.out.println(product);
        }
    }
}