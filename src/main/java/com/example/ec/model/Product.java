package com.example.ec.model;

import lombok.Data;

@Data
public class Product {
    private int id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
}
