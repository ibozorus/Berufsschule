package iek;

import java.util.Scanner;

public class portoermittlung {
    public static void aufgabe1() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Geben Sie das Gewicht ein!");
            System.out.println("Um das Programm zu beenden geben Sie 0(Null) ein!");
            double gewicht = input.nextDouble();

            if (gewicht == 0) {
                System.out.println("Das Programm wird gestoppt!");
                break;
            } else if (gewicht > 1000 || gewicht < 0) {
                System.out.println("Ungültiger Wert! Versuchen Sie es nochmal!");
            } else if (gewicht <= 20) {
                System.out.println("Porto:1,00 Euro");
            } else if (gewicht <= 50) {
                System.out.println("Porto:1,70 Euro");
            } else if (gewicht <= 100) {
                System.out.println("Porto:2,40 Euro");
            } else if (gewicht <= 250) {
                System.out.println("Porto:3,20 Euro");
            } else if (gewicht <= 500) {
                System.out.println("Porto:4,00 Euro");
            } else if (gewicht <= 1000) {
                System.out.println("Porto:4,80 Euro");
            }
        }
    }

    public static void aufgabe2() {
        Scanner input = new Scanner(System.in);
        boolean control = true;
        while (control) {
            System.out.println("Geben Sie das Porto mit zwei Nachkommastellen ein!");
            System.out.println("Um das Programm zu beenden geben Sie 0(Null) ein!");
            String porto = input.nextLine();

            switch (porto) {
                case "0":
                    System.out.println("Programm wird gestoppt");
                    control = false;
                    break;
                case "1,00":
                    System.out.println("Maximales Gewicht: 20g");
                    break;
                case "1,70":
                    System.out.println("Maximales Gewicht: 50g");
                    break;
                case "2,40":
                    System.out.println("Maximales Gewicht: 100g");
                    break;
                case "3,20":
                    System.out.println("Maximales Gewicht: 250g");
                    break;
                case "4,00":
                    System.out.println("Maximales Gewicht: 500g");
                    break;
                case "4,80":
                    System.out.println("Maximales Gewicht: 1000g");
                    break;
                default:
                    System.out.println("Ungültiger Wert");
                    break;
            }
        }
    }

    public static void aufgabe3() {
        Scanner input = new Scanner(System.in);
        boolean control = true;
        do {
            System.out.println("Geben Sie das Porto mit zwei Nachkommastellen ein!");
            System.out.println("Um das Programm zu beenden geben Sie 0(Null) ein!");
            String porto = input.nextLine();

            switch (porto) {
                case "0":
                    System.out.println("Programm wird gestoppt");
                    control = false;
                    break;
                case "1,00":
                    System.out.println("Maximales Gewicht: 20g");
                    break;
                case "1,70":
                    System.out.println("Maximales Gewicht: 50g");
                    break;
                case "2,40":
                    System.out.println("Maximales Gewicht: 100g");
                    break;
                case "3,20":
                    System.out.println("Maximales Gewicht: 250g");
                    break;
                case "4,00":
                    System.out.println("Maximales Gewicht: 500g");
                    break;
                case "4,80":
                    System.out.println("Maximales Gewicht: 1000g");
                    break;
                default:
                    System.out.println("Ungültiger Wert");
                    break;
            }
        } while (control);
    }

    public static void main(String[] args) {
//        aufgabe1();
//        aufgabe2();
        aufgabe3();
    }
}
