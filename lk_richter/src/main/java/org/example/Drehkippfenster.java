package org.example;

public class Drehkippfenster extends Fenster {

    private Material material;
    private boolean drehbar;
    private boolean kippbar;
    private String farbe;

    public Drehkippfenster(int hoch, int breit, double preis) {
        super(hoch, breit, preis);
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setDrehKipp(boolean drehbar, boolean kippbar) {
        this.drehbar = drehbar;
        this.kippbar = kippbar;
    }

    public void gibEigenschaftenAus() {
        System.out.println("Eigenschaften von Drehkippfenster ausgegeben");
    }
}
