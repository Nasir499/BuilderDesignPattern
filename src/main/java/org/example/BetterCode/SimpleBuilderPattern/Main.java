package org.example.BetterCode.SimpleBuilderPattern;

public class Main {
    public static void main(String[] args) {
        Builder b = new Builder();
        b.setName("Kola");
        b.setPrice(24);
        Product p = new Product(b);
        System.out.println(p);
    }
}
