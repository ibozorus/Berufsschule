package org.example;

public class Employee extends Person {

    private int number;
    protected static int inhousecount = 0;
    private EmployeeCar car;

    private int anzahlAllocatedCar = 0;

    public Employee(String lastName, String firstName) {
        super(lastName, firstName);
        this.number = 0;
        inhousecount++;
    }

    public void logout() {
        inhousecount--;
    }

    public EmployeeCar allocateCar() {
        this.car = new EmployeeCar("31", "ADS", "SAD");
        this.anzahlAllocatedCar++;
        return this.car;
    }

    public EmployeeCar getCarInfo() {
        return this.car;
    }

    public static int getInhousecount() {
        return inhousecount;
    }
}
