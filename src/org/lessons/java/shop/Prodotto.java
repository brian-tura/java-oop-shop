package org.lessons.java.shop;

public class Prodotto {
    int codice;
    String nome;
    String descrizione;
    float prezzo;
    int iva;

    public Prodotto(String nome, String descrizione, float prezzo, int iva) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
        this.codice = (int) (Math.random() * 1000001);
    }

    public void getPrezzo() {
        System.out.println(this.prezzo);
    }

    public void getPrezzoIva() {
        this.prezzo += this.prezzo * this.iva / 100;
        System.out.println(this.prezzo);
    }

    public void getNome() {
        System.out.println(this.codice + "-" + this.nome);
    }

}
