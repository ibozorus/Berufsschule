package org.example;

public class Konto {
    private double kontostand;
    private String iban;

    public Konto(String iban) {
        this.iban = iban;
        kontostand = 0;
    }

    public double getKontostand() {
        return kontostand;
    }

    public String getIban() {
        return iban;
    }

    public void einzahlen(double betrag) {
        if(betrag < 0){
            System.out.println("Betrag darf keine negative Zahl sein!");
            return;
        }
        kontostand += betrag;
    }

    public boolean auszahlen(double betrag) {
        if(betrag < 0){
            System.out.println("Betrag darf keine negative Zahl sein!");
            return false;
        }
        if (kontostand < betrag) {
            System.out.println("Betrag darf nicht größer als Kontostand sein!");
            return false;
        }
        kontostand -= betrag;
        return true;
    }
}