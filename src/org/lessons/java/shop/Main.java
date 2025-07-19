package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto Pera = new Prodotto("Pera", "Una pera", 14.9F, 22);

        Pera.getPrezzo();
        Pera.getPrezzoIva();
        Pera.getNome();
    }
}
