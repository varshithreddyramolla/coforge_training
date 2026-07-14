package com.coforge.day4assignment;

public class Customer {

    private int customerId;
    private String customerName;
    private Cart cart;

    public Customer(int customerId, String customerName, Cart cart) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.cart = cart;
    }

    public Cart getCart() {
        return cart;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId +
                ", Customer Name: " + customerName;
    }
}