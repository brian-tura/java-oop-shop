package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisore extends Prodotto {
    float dimensione;
    boolean smart;

    public Televisore(String nome, String descrizione, String marca, BigDecimal prezzo, BigDecimal iva, float dimensione, boolean smart) {
        super(nome, descrizione, marca, prezzo, iva);
        this.dimensione = dimensione;
        this.smart = smart;
    }

    public float getDimensione() {
        return this.dimensione;
    }

    public void setDimensione(float dimensione) {
        this.dimensione = dimensione;
    }

    public boolean getSmart() {
        return this.smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }
}
