package com.coforge.day4assignment;

public class Shoppingtest {

    public static void main(String[] args) {

        Cart cart = new Cart();

        Product p1 = new Product(1, "Laptop", 60000);
        Product p2 = new Product(2, "Mouse", 800);
        Product p3 = new Product(3, "Keyboard", 1500);

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.displayProducts();

        cart.removeProduct(p2);

        System.out.println();

        cart.displayProducts();

        cart.calculateBill();
    }
}