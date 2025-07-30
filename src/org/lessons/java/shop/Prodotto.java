package org.lessons.java.shop;

import java.math.BigDecimal;

public class Prodotto {
    private int codice;
    String nome;
    String descrizione;
    String marca;
    BigDecimal prezzo;
    BigDecimal iva;

    public Prodotto(String nome, String descrizione, String marca, BigDecimal prezzo, BigDecimal iva) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
        this.marca = marca;
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

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCodice() {
        return this.codice;
    }
}
