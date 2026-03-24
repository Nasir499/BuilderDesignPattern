package org.example.BetterCode.BuilderDesignPattern;



public class Main {
    public static void main(String[] args) {
        Product p = Product.getBuilder()
                    .setCategory("Brandy")
                    .setName("Whisky")
                    .setDescription("akhjdh")
                    .setDiscount(10)
                    .build();

    }
}
