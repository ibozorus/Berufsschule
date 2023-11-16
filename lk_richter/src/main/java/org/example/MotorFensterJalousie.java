package org.example;

public class MotorFensterJalousie extends Dachfenster{

    private static int count;

    public MotorFensterJalousie(int hoch, int breit, double preis, boolean m, boolean j, boolean a) {
        super(hoch, breit, preis, m, j, a);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void bewegenAuf() {
        System.out.println("Motorfensterjalousie wird aufbewegt");
    }

    @Override
    public void bewegenZu() {
        System.out.println("Motorfensterjalousie wird zubewegt");
    }

    @Override
    public void gibEigenschaftenAus() {
        System.out.println("Eigenschaften von Motorfensterjalousie ausgegeben");
    }
}
