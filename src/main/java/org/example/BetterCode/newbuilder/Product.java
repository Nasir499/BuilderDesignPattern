package org.example.BetterCode.newbuilder;

public class Product {
    private String name;
    private int price;
    private String desc;
    private Product(builder b){
        this.name = b.name;
        this.price = b.price;
        this.desc=b.desc;
    }
    public static builder getBuilder(){
        return new builder();
    }
    public static class builder{
        private String name;
        private int price;
        private String desc;

        public builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public builder setName(String name) {
            this.name = name;
            return this;
        }

        public builder setDesc(String desc) {
            this.desc = desc;
            return this;
        }

        public int getPrice() {
            return this.price;
        }

        public String getDesc() {
            return this.desc;
        }

        public String getName() {
            return this.name;
        }
        public  Product build(){
            return new Product(this);
        }
    }
}
