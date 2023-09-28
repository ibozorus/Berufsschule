package org.example;

public abstract class Drucker {
    private int hoehe;
    private int breite;
    private int laenge;
    private int gewicht;
    private int preis;
    private EConnectivitiy konnektivitaet;
    private EBedienart bedienart;

    public abstract void drucken();

    public abstract void kopieren();

    public abstract void wechselMedium();

    public void scannen() {

    }

    public void papierNachfuellen() {

    }
}
