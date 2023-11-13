package com.springmvc.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// POJO - Plan Object Java Object
@Entity
@Table(name = "Categories")
public class Category {
    @Id
    @Column(name = "categoryID")
    private String categoryID;
    @Column(name = "categoryName")
    private String categoryName;
    @Column(name = "description")
    private String description;

    public Category() {
    }

    // CONSTRUCTER
    public Category(String categoryID, String categoryName, String description) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.description = description;
    }

    // GETTER AND SETTER
    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
