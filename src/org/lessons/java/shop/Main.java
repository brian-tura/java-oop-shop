package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto Pera = new Prodotto("Pera", "Una pera", new BigDecimal(14.90), new BigDecimal(0.22));

        Pera.getPrezzo();
        Pera.getPrezzoIva();
        Pera.getNome();
    }
}
