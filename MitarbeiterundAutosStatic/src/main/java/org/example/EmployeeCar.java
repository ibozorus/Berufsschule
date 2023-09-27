package org.example;

public class EmployeeCar {

    private Car car;
    private int mileage;
    private int anzahlBeschleunigung;
    private int tankCounter = 0;
    private double gesamtVerbrauch = 0;

    public EmployeeCar(String sign, String ident, String plate) {
        this.mileage = 0;
        car = new Car(sign, ident, plate);
    }

    public Car getCar() {
        return this.car;
    }

    public void addMileAge(int distance) {
        this.mileage += distance;
    }

    public double addTank(double tank) {
        if (tank > this.car.getMaxTank() - this.car.getCurrentTank()) {
            tank = this.car.getMaxTank() - this.car.getCurrentTank();
        }
        this.car.setCurrentTank(this.car.getCurrentTank() + tank);
        this.tankCounter++;
        return tank;
    }

    public double starten() {
        if (this.car.getCurrentTank() >= 0.1) {
            System.out.println("Das Auto wird gestartet!");
            this.car.setCurrentTank(this.car.getCurrentTank() - 0.1);
            this.car.setAutoAn(true);
            this.gesamtVerbrauch =+ 0.1;
        } else {
            System.out.println("Zu wenig Sprit zum Starten!");
        }
        return this.car.getCurrentTank();

    }

    public double beschleunigen() {
        if (this.car.getCurrentTank() > 1.5) {
            this.car.setCurrentTank(this.car.getCurrentTank() - 1.5);
            this.car.setSpeed(this.car.getSpeed() + 25);
            this.addMileAge(12);
            System.out.println("Das Auto wurde beschleunigt!");
            this.anzahlBeschleunigung++;
            this.gesamtVerbrauch =+ 1.5;
        } else {
            System.out.println("Zu wenig Sprit zum Beschleunigen!");
        }
        return this.car.getCurrentTank();
    }
    public void bremsen(){
        this.car.setSpeed(0);
        System.out.println("Das Auto wurde gebremst!");
    }
    public void stoppen(){
        this.car.setAutoAn(false);
        System.out.println("Das Auto wurde gestoppt!");
    }

    public int getCurMileAge() {
        return this.mileage;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getAnzahlBeschleunigung() {
        return anzahlBeschleunigung;
    }

    public void setAnzahlBeschleunigung(int anzahlBeschleunigung) {
        this.anzahlBeschleunigung = anzahlBeschleunigung;
    }

    public int getTankCounter() {
        return tankCounter;
    }

    public void setTankCounter(int tankCounter) {
        this.tankCounter = tankCounter;
    }

    public double getGesamtVerbrauch() {
        return gesamtVerbrauch;
    }

    public void setGesamtVerbrauch(double gesamtVerbrauch) {
        this.gesamtVerbrauch = gesamtVerbrauch;
    }
}
