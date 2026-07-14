package com.coforge.day4assignment;

public class Product {

    private int productId;
    private String productName;
    private double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId +
                ", Product Name: " + productName +
                ", Price: " + price;
    }
}