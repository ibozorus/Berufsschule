package org.example;

public class EmployeeCar {

    private Car car;
    private int mileage;

    public EmployeeCar(String sign, String ident, String plate) {
        this.mileage = 0;
        car = new Car(sign, ident, plate);
    }

    public Car getCar() {
        return this.car;
    }
    public void addMileAge(int distance){
        this.mileage += distance;
    }
    public int getCurMileAge(){
        return this.mileage;
    }
}
