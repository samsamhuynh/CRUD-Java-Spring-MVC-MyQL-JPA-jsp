package com.springmvc.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Products")
public class Product {
    @Id
    @Column(name = "productID")
    private String productID;
    @Column(name = "categoryID")
    private String categoryID;
    @Column(name = "productName")
    private String productName;
    @Column(name = "price")
    private String price;
    @Column(name = "description")
    private String description;

    public Product() {
    }

    // CONSTRUCTER
    public Product(String productID, String categoryID, String productName, String price, String description) {
        this.productID = productID;
        this.categoryID = categoryID;
        this.productName = productName;
        this.price = price;
        this.description = description;
    }

    // GETTER AND SETTER
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
