package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {
    private int codice;
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

    public Prodotto(String nome, BigDecimal prezzo, BigDecimal iva) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.iva = iva;
        this.codice = (int) (Math.random() * 1000001);
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public String getNome() {
        return this.codice + "-" + this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getIva() {
        return this.iva;
    }
    
    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public String getDescrizione() {
        return this.descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public BigDecimal getPrezzoIva() {
        BigDecimal prezzoIva = prezzo.add(prezzo.multiply(iva));
        return prezzoIva;
    }

    public int getCodice() {
        return this.codice;
    }
}
