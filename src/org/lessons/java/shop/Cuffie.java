package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {

    String colore;
    boolean wireless;

    public Cuffie(String nome, String descrizione, String marca, BigDecimal prezzo, BigDecimal iva, String colore,
            boolean wireless) {
        super(nome, descrizione, marca, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }
    
     public String getColore() {
        return this.colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean getWireless() {
        return this.wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
}
