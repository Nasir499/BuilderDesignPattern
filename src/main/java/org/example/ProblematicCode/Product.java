package org.example.ProblematicCode;



import java.util.List;

public class Product {
    private  String name;

    private  String description;

    private  String brand;

    private int price;

    private String category;

    private  int discount;

    private String createdAt;

    private  String  updatedAt;

    private List<String> images;

    Product(String name,String description,int price,String category,String createdAt,String updatedAt,String brand,List<String> images,int discount){
        this.brand=brand;
        this.category=category;
        this.name=name;
        this.brand=brand;
        this.createdAt=createdAt;
        this.description=description;
        this.price=price;
        this.images=images;
        this.updatedAt=updatedAt;
        this.discount=discount;

    }

    public Product(String name,int price) {
        this.name=name;
        this.price=price;
    }
}

