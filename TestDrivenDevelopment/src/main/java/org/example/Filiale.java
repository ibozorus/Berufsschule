package org.example;

import java.util.ArrayList;

public class Filiale {

    private ArrayList<Kunde> kundenListe;
    private ArrayList<Mitarbeiter> mitarbeiterListe;
    private int filialNr;

    public Filiale(ArrayList<Kunde> kundenListe, ArrayList<Mitarbeiter> mitarbeiterListe, int filialNr) {
        this.kundenListe = kundenListe;
        this.mitarbeiterListe = mitarbeiterListe;
        this.filialNr = filialNr;
    }

    public void mitarbeiterEinstellen(Mitarbeiter mitarbeiter){

    }

    public void mitarbeiterKuendigen(Mitarbeiter mitarbeiter){

    }
    public void kundeHinzufuegen(Kunde kunde){

    }
    public void kundeEntfernen(Kunde kunde){

    }

    public ArrayList<Kunde> getKundenListe() {
        return kundenListe;
    }

    public void setKundenListe(ArrayList<Kunde> kundenListe) {
        this.kundenListe = kundenListe;
    }

    public ArrayList<Mitarbeiter> getMitarbeiterListe() {
        return mitarbeiterListe;
    }

    public void setMitarbeiterListe(ArrayList<Mitarbeiter> mitarbeiterListe) {
        this.mitarbeiterListe = mitarbeiterListe;
    }

    public int getFilialNr() {
        return filialNr;
    }

    public void setFilialNr(int filialNr) {
        this.filialNr = filialNr;
    }
}
