package org.example;

public class Dachfenster extends Fenster{

    private boolean mitRollo;
    private boolean mitAustritt;

    public Dachfenster(int hoch, int breit, double preis, boolean m, boolean j, boolean a) {
        super(hoch, breit, preis);
    }

    public void bewegenAuf(){
        System.out.println("Aufbewegen");
    }
    public void bewegenZu(){
        System.out.println("Zubewegen");
    }

    public void gibEigenschaftenAus() {
        System.out.println("Eigenschaften von Dachfenster ausgegeben");
    }
}
