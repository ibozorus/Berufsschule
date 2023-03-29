package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Mitarbeiter extends Person{

    private int mitarbeiterNr;
    private boolean istChef;
    private ArrayList<Kunde> kundenList;
    private int filialNr;

    public Mitarbeiter(String name, String vorname, String anrede, Date geburtsDatum, int mitarbeiterNr, boolean istChef, ArrayList<Kunde> kundenList, int filialNr) {
        super(name, vorname, anrede, geburtsDatum);
        this.mitarbeiterNr = mitarbeiterNr;
        this.istChef = istChef;
        this.kundenList = kundenList;
        this.filialNr = filialNr;
    }

    public void aendereBetreuer(Kunde kunde, Mitarbeiter mitarbeiter){

    }
    
    @Override
    public void sterben() {
//h
    }
}
