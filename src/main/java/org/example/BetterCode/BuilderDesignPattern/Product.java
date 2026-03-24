package org.example.BetterCode.BuilderDesignPattern;



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

    private Product(Builder b) {
        if (b.getPrice() > 0) {
            this.price = b.getPrice();
        }
        this.name = b.getName();
        this.price=b.getPrice();
        this.brand = b.getBrand();
        this.discount = b.getDiscount();
        this.description = b.getDescription();
        this.category = b.getCategory();
        this.createdAt = b.getCreatedAt();
        this.updatedAt=b.getUpdatedAt();
        this.images=b.getImages();
    }

    public static Builder getBuilder(){
        return new Builder();
    }
    public static  class Builder {
        private  String name;

        private  String description;

        private  String brand;

        private int price;

        private String category;

        private  int discount;

        private String createdAt;

        private  String  updatedAt;

        private List<String> images;

        Builder(){

        }
        public  Product build(){
            return new Product(this);
        }
        public Builder setName(String name){
            this.name=name;
            return this;
        }

        public String getName(){
            return this.name;
        }

        public Builder setDescription(String description){
            this.description=description;
            return this;
        }

        public String getDescription(){
            return this.description;
        }

        public Builder setCategory(String category){
            this.category=category;
            return this;
        }

        public String getCategory(){
            return this.category;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public int getPrice() {
            return this.price;
        }

        public Builder setBrand(String brand){
            this.brand=brand;
            return this;
        }

        public String getBrand() {
            return this.brand;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public String getCreatedAt() {
            return this.createdAt;
        }

        public Builder setDiscount(int discount) {
            this.discount = discount;
            return this;
        }

        public int getDiscount() {
            return this.discount;
        }

        public Builder setImages(List<String> images) {
            this.images = images;
            return this;
        }

        public List<String> getImages() {
            return this.images;
        }

        public Builder setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public String getUpdatedAt() {
            return this.updatedAt;
        }
    }

}
