package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        // Prodotto Pera = new Prodotto("Pera", "Una pera", "Melinda", new BigDecimal(14.90), new BigDecimal(0.22));

        // System.out.println("Prezzo: " + Pera.getPrezzo().setScale(2, RoundingMode.DOWN) + " euro");
        // System.out.println(
        //         "Iva: " + (Pera.getIva().multiply(BigDecimal.valueOf(100))).setScale(2, RoundingMode.DOWN) + "%");
        // System.out.println("Nome: " + Pera.getNome());
        // System.out.println("Descrizione: " + Pera.getDescrizione());
        // System.out.println("Codice: " + Pera.getCodice());
        // System.out.println("Prezzo ivato: " + Pera.getPrezzoIva().setScale(2, RoundingMode.DOWN) + " euro");

        // Smartphone Samsung = new Smartphone("Galaxy A21", "Smartphone", "Samsung", new BigDecimal(299.90), new BigDecimal(0.22), 128);

        // System.out.println("Prezzo: " + Samsung.getPrezzo().setScale(2, RoundingMode.UP) + " euro");
        // System.out.println(
        //         "Iva: " + (Samsung.getIva().multiply(BigDecimal.valueOf(100))).setScale(2, RoundingMode.DOWN) + "%");
        // System.out.println("Nome: " + Samsung.getNome());
        // System.out.println("Descrizione: " + Samsung.getDescrizione());
        // System.out.println("Codice: " + Samsung.getCodice());
        // System.out.println("Prezzo ivato: " + Samsung.getPrezzoIva().setScale(2, RoundingMode.DOWN) + " euro");
        // System.out.println("Codice IMEI: " + Samsung.getImei());
        // System.out.println("Memoria: " + Samsung.getMemoria() + "GB");

        Televisore LG = new Televisore("LG OLED", "Televisore OLED", "LG", new BigDecimal(499.90), new BigDecimal(0.22), 100.50f , false);

        System.out.println("Prezzo: " + LG.getPrezzo().setScale(2, RoundingMode.UP) + " euro");
        System.out.println(
                "Iva: " + (LG.getIva().multiply(BigDecimal.valueOf(100))).setScale(2, RoundingMode.DOWN) + "%");
        System.out.println("Nome: " + LG.getNome());
        System.out.println("Descrizione: " + LG.getDescrizione());
        System.out.println("Codice: " + LG.getCodice());
        System.out.println("Prezzo ivato: " + LG.getPrezzoIva().setScale(2, RoundingMode.UP) + " euro");
        System.out.println("Dimensione: " + LG.getDimensione() + " cm");
        String Smart;
        if(LG.getSmart() == true){
            Smart = "Si";
        } else {
            Smart = "No";
        }
        System.out.println("Smart: " + Smart);


    }
}
