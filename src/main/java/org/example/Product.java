package org.example;

import com.google.gson.annotations.SerializedName;

public class Product {
    private int id;
    private String name;
    private String description;
    private String color;
    private String[] category;
    private String brand;
    private int price;
    private String status;

    public Product() {
    }

    public Product(int id, String name, String description, String color, String[] category, String brand, int price, String status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.color = color;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getColor() {
        return color;
    }

    public String[] getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
