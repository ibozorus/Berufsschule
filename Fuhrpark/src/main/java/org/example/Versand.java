package org.example;

public class Versand {
    private String anbieter;
    private String versandart;
    private double preis;

    public Versand(String anbieter, String versandart) {
        this.anbieter = anbieter;
        this.versandart = versandart;
        this.preis = 0.0;
    }

    public Versand(String anbieter, String versandart, double preis) {
        this.anbieter = anbieter;
        this.versandart = versandart;
        this.preis = preis;
    }

    public String getAnbieter() {
        return anbieter;
    }

    public void setAnbieter(String anbieter) {
        this.anbieter = anbieter;
    }

    public String getVersandart() {
        return versandart;
    }

    public void setVersandart(String versandart) {
        this.versandart = versandart;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}
