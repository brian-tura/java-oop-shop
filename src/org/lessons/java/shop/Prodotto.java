package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {
    public int codice;
    public String nome;
    public String descrizione;
    public BigDecimal prezzo;
    public BigDecimal iva;

    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
        this.codice = (int) (Math.random() * 1000001);
    }

    public void getPrezzo() {
        System.out.println(prezzo.setScale(2, RoundingMode.DOWN));
    }

    public void getPrezzoIva() {
        BigDecimal prezzoIva = prezzo.add(prezzo.multiply(iva));
        System.out.println(prezzoIva.setScale(2, RoundingMode.DOWN));
    }

    public void getNome() {
        System.out.println(this.codice + "-" + this.nome);
    }

}
