package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Schröpfer", "Felix");
        Scanner scanner = new Scanner(System.in);
        int auswahl;
        do {
            System.out.println("\nBitte wählen Sie eine Aktion:");
            System.out.println("0. Beenden");
            System.out.println("1. Einem Mitarbeiter ein Fahrzeug zuweisen");
            System.out.println("2. Fahrzeuginformationen anzeigen");
            System.out.println("3. Laufleistung erhöhen");
            System.out.println("4. Tanken");
            System.out.println("5. Auto starten");
            System.out.println("6. Beschleunigen");
            System.out.println("7. Bremsen");
            System.out.println("8. Stoppen");
            System.out.println("9. Ausgabe Infos");
            System.out.print("Ihre Auswahl: ");
            auswahl = scanner.nextInt();
            switch (auswahl) {
                case 0:
                    System.out.println("Tschauiii!");
                    break;
                case 1:
                    EmployeeCar allocatedCar = employee.allocateCar();
                    Car car = allocatedCar.getCar();
                    System.out.println("Das Fahrzeug\n" + car.getIdent() + " " + car.getSign() + " " + car.getPlate() + "\n dem Mitarbeiter\n" + employee.getFirstName() + " " + employee.getLastName() + " zugewisen.");
                    break;
                case 2:
                    Car carx = employee.getCarInfo().getCar();
                    System.out.println("Das Fahrzeug\n" + carx.getIdent() + " " + carx.getSign() + " " + carx.getPlate());
                    break;
                case 3:
                    System.out.println("Um wie viel erhöhen? ");
                    int laufleistung = scanner.nextInt();
                    employee.getCarInfo().addMileAge(laufleistung);
                    System.out.println("Laufleistung wurde um " + laufleistung + " erhöht!");
                    break;
                case 4:
                    System.out.println("Wie viel tanken?");
                    double tank = scanner.nextDouble();
                    double getankteMenge = employee.getCarInfo().addTank(tank);
                    System.out.println(getankteMenge + " Liter getankt!");
                    break;
                case 5:
                    double ubrigeSprit = employee.getCarInfo().starten();
                    System.out.println("Übrige Sprit: " + ubrigeSprit + " L!");
                    break;
                case 6:
                    System.out.println("Übrige Sprit: " + employee.getCarInfo().beschleunigen() + " L!");
                    break;
                case 7:
                    employee.getCarInfo().bremsen();
                    break;
                case 8:
                    employee.getCarInfo().stoppen();
                    break;
                case 9:
                    EmployeeCar ecar = employee.getCarInfo();
                    System.out.println("Gesamtverbrauch: " + ecar.getGesamtVerbrauch());
                    System.out.println("Gesamtstrecke: " + ecar.getMileage());
                    System.out.println("Anzahl Beschleunigung: " + ecar.getAnzahlBeschleunigung());
                    System.out.println("Tankstopps: " + ecar.getTankCounter());
                    break;
                default:
                    System.out.println("Ungültige Auswahl. Bitte wählen Sie erneut.");
            }
        } while (auswahl != 0);

        scanner.close();
    }
}