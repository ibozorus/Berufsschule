package org.example;

public class Car {
    private String sign;
    private String ident;
    private String plate;
    private final double maxTank = 50;
    private double currentTank = 0;
    private int speed = 0;
    private boolean autoAn = false;



    public Car(String sign, String ident, String plate) {
        this.sign = sign;
        this.ident = ident;
        this.plate = plate;
    }



    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public double getCurrentTank() {
        return currentTank;
    }

    public void setCurrentTank(double currentTank) {
        this.currentTank = currentTank;
    }

    public double getMaxTank() {
        return maxTank;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isAutoAn() {
        return autoAn;
    }

    public void setAutoAn(boolean autoAn) {
        this.autoAn = autoAn;
    }
}
