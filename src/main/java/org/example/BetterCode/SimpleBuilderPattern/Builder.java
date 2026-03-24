package org.example.BetterCode.SimpleBuilderPattern;

import java.util.List;

public class Builder {
    private  String name;

    private  String description;

    private  String brand;

    private int price;

    private String category;

    private  int discount;

    private String createdAt;

    private  String  updatedAt;

    private List<String> images;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public String getDescription(){
        return this.description;
    }

    public void setCategory(String category){
        this.category=category;
    }

    public String getCategory(){
        return this.category;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
    //    ......
}
