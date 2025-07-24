package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Prodotto Pera = new Prodotto("Pera", "Una pera", new BigDecimal(14.90), new BigDecimal(0.22));

        System.out.println("Prezzo: " + Pera.getPrezzo().setScale(2, RoundingMode.DOWN) + " euro");
        System.out.println(
                "Iva: " + (Pera.getIva().multiply(BigDecimal.valueOf(100))).setScale(2, RoundingMode.DOWN) + "%");
        System.out.println("Nome: " + Pera.getNome());
        System.out.println("Descrizione: " + Pera.getDescrizione());
        System.out.println("Codice: " + Pera.getCodice());
        System.out.println("Prezzo ivato: " + Pera.getPrezzoIva().setScale(2, RoundingMode.DOWN) + " euro");
    }
}
