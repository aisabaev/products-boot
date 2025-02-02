package com.example.products_boot.models;



public class Product implements Comparable<Product>{
    private int productId;
    private String productName;
    private String description;
    private double price;

    public Product(int productId, String productName, String description, double price) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.price = price;
    }

    public Product() {

    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product product) {
        if (this.getPrice() > product.getPrice()){
            return 1;
        }else if (this.getPrice() < product.getPrice()){
            return -1;
        }else {
            return 0;
        }

    }
}
