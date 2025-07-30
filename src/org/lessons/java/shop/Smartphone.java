package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {
    int memoria;
    private long imei;

    public Smartphone(String nome, String descrizione, String marca, BigDecimal prezzo, BigDecimal iva, int memoria) {
        super(nome, descrizione, marca, prezzo, iva);
        this.memoria = memoria;
        this.imei = (long) (Math.random() * 1000000000000001l);
    }

    public long getImei() {
        return this.imei;
    }
    
    public int getMemoria() {
        return this.memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
}
