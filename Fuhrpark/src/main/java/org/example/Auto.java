package org.example;

import javax.swing.JOptionPane;

public class Auto {
    private String art;
    private double v;
    private double vMax;
    private double tank;

    public Auto() {
        art = "keine Angabe";
        v = 0.0;
        vMax = 0.0;
        tank = 50.0;
    }

    public void kaufen() {
        art = JOptionPane.showInputDialog("Geben Sie die gewünschte Art ein");
        String eingabe_vMax = JOptionPane.showInputDialog("Geben Sie die maximale Geschwindigkeit ein:");
        vMax = Double.parseDouble(eingabe_vMax);
    }

    public void tanken() {
        tank = 50;
    }

    public void ausgabe() {
        System.out.println("Der " + art + " fährt aktuell " + v + " km/h und hat noch" + tank + " Liter im Tank");
    }

    public void beschleunigen() {
        if(tank <= 0 ){
            System.out.println("TANK LEER!");
            return;
        }
        v = v + 50;
        if(v > vMax){
            v = vMax;
        }
        tank = tank - 5;
    }

    public void bremsen() {
        v = v - 50;
        if(v < 0){
            v = 0;
        }
    }
}
