package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class FilialeTest {

    Mitarbeiter mitarbeiter1 = new Mitarbeiter("Müller", "Berndt", "divers", new Date(1967, 4, 24), 1, false, null, 1 );

    Kunde kunde1 = new Kunde("Schwarz", "Mike", "Herr", new Date(1998, 3, 3),1, mitarbeiter1, null, 1);

    Filiale filiale = new Filiale(new ArrayList<Kunde>(Arrays.asList(kunde1)), new ArrayList<Mitarbeiter>(Arrays.asList(mitarbeiter1)), 1);

    @Test
    void mitarbeiterEinstellen() {
    }

    @Test
    void mitarbeiterKuendigen() {
    }

    @Test
    void kundeHinzufuegen() {
    }

    @Test
    void kundeEntfernen() {
    }

    @Test
    void getKundenListe() {
    }

    @Test
    void setKundenListe() {
    }

    @Test
    void getMitarbeiterListe() {
    }

    @Test
    void setMitarbeiterListe() {
    }

    @Test
    void getFilialNr() {
    }

    @Test
    void setFilialNr() {
    }
}