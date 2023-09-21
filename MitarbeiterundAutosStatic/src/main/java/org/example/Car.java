package org.example;

public class Car {
    private String sign;
    private String ident;
    private String plate;

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
}
