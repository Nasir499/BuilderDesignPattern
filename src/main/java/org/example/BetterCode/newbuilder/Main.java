package org.example.BetterCode.newbuilder;

public class Main {
    public static void main(String[] args) {
        Product p = Product.getBuilder()
                .setName("alu")
                .setDesc("nhjkhkfj")
                .setPrice(24)
                .build();

    }
}
