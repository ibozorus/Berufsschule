package org.example;

public class Fenster {
    private FensterWerte fensterWerte;

    public static int count;

    public Fenster(int hoch, int breit, double preis) {
        fensterWerte = new FensterWerte();
        fensterWerte.hoch = hoch;
        fensterWerte.breit = breit;
        fensterWerte.preis = preis;
    }

    public FensterWerte getFensterWerte() {
        return fensterWerte;
    }
}
