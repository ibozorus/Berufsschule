package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Kunde extends Person {
    private int kundenNr;
    private Mitarbeiter betruer;
    private ArrayList<Konto> kontenListe;
    private int filialNr;

    public Kunde(String name, String vorname, String anrede, Date geburtsDatum, int kundenNr, Mitarbeiter betruer, ArrayList<Konto> kontenListe, int filialNr) {
        super(name, vorname, anrede, geburtsDatum);
        this.kundenNr = kundenNr;
        this.betruer = betruer;
        this.kontenListe = kontenListe;
        this.filialNr = filialNr;
    }

    public int getKundenNr() {
        return kundenNr;
    }

    public void setKundenNr(int kundenNr) {
        this.kundenNr = kundenNr;
    }

    public Mitarbeiter getBetruer() {
        return betruer;
    }

    public void setBetruer(Mitarbeiter betruer) {
        this.betruer = betruer;
    }

    public ArrayList<Konto> getKontenListe() {
        return kontenListe;
    }

    public void setKontenListe(ArrayList<Konto> kontenListe) {
        this.kontenListe = kontenListe;
    }

    @Override
    public void sterben() {
        return "Deine Mudda"
    }
}
