package org.example;

public class MotorFensterAufZu extends Dachfenster {

    private static int count;

    public MotorFensterAufZu(int hoch, int breit, double preis, boolean m, boolean j, boolean a) {
        super(hoch, breit, preis, m, j, a);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void bewegenAuf() {
        System.out.println("Motorfensteraufundzu wird aufbewegt");
    }

    @Override
    public void bewegenZu() {
        System.out.println("Motorfensteraufundzu wird zubewegt");
    }

    @Override
    public void gibEigenschaftenAus() {
        System.out.println("Eigenschaften von Motorfensteraufundzu ausgegeben");
    }
}
