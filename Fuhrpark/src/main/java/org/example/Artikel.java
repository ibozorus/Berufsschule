package org.example;

public class Artikel {
    private String name;
    private double preis;

    public Artikel(String name, double preis) {
        this.name = name;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }


    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}
