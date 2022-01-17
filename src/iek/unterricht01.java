package iek;

import java.util.Scanner;

public class unterricht01 {
    public static void Hello() {
        System.out.println("Hello World");
    }

    public static void aufgabe1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Gib die Länge der Strecke als Kilometer ein!");
        double km = input.nextDouble();
        double kmWert = km;
//        System.out.println(kmWert);
        System.out.println("Gib die getankte Kraftstoffmenge als Liter ein!");
        double stoff = input.nextDouble();
        double stoffWert = stoff;
//        System.out.println(stoffWert);
        double ergebnis = (stoffWert / kmWert) * 100;
        System.out.println("Verbrauchte Kraftstoff pro 100 Km: " + ergebnis);

    }

    public static void aufgabe2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Gib die Dividend als Ganzzahl ein:");
        int dividend = input.nextInt();
        System.out.println("Gib den Divisor als Ganzzahl ein:");
        int divisor = input.nextInt();
        System.out.println("Der Rest der Division: " + dividend % divisor);

    }

    public static void aufgabe3() {
        Scanner input = new Scanner(System.in);
        System.out.println("Gib den Listenpreis in Euro ein!");
        double listenpreis = input.nextDouble();
        System.out.println("Gib den Rabatt in Prozent ein!");
        double rabatt = input.nextDouble();
        System.out.println("Gib den Skonto in Prozent ein!");
        double skonto = input.nextDouble();
        double ergebnis = (listenpreis-(listenpreis*rabatt/100))-((listenpreis-rabatt)*skonto/100);
        System.out.println("Bareinkaufspreis: "+ergebnis);
    }

    public static void aufgabe4() {
        Scanner input = new Scanner(System.in);
        System.out.println("Gib die elektrische Spannung ein!");
        double spannung = input.nextDouble();
        System.out.println("Gib die elektrische Stromstärke ein!");
        double stromstaerke = input.nextDouble();
        System.out.println("Widerstand: " + spannung / stromstaerke);
    }

    public static void aufgabe5() {
        Scanner input = new Scanner(System.in);
        System.out.println("Gib die Länge des Rechtecks ein!");
        double laenge = input.nextDouble();
        System.out.println("Gib die Breite des Rechtecks ein!");
        double breite = input.nextDouble();
        System.out.println("Umfang: " + 2 * (laenge + breite));
        System.out.println("Flächeninhalt: " + laenge * breite);
        System.out.println("Diagonale: " + Math.sqrt((laenge * laenge) + (breite * breite)));
    }

    public static void aufgabe6() {
        Scanner input = new Scanner(System.in);
        System.out.println("Gib die Speichergröße in Byte ein!");
        double groesse = input.nextDouble();
        System.out.println("Megabyte: " + groesse / 1000000);
        System.out.println("Mebibyte: " + groesse / 1048576);
    }

    public static void aufgabe7() {
        Scanner input = new Scanner(System.in);
        System.out.println("Gib die erste Zahl ein!");
        double ersteZahl = input.nextDouble();
        System.out.println("Gib die zweite Zahl ein!");
        double zweiteZahl = input.nextDouble();
        System.out.println("Gib die dritte Zahl ein!");
        double dritteZahl = input.nextDouble();
        System.out.println("Gib die vierte Zahl ein!");
        double vierteZahl = input.nextDouble();
        System.out.println("Durcschnitt: " + (ersteZahl + zweiteZahl + dritteZahl + vierteZahl) / 4);
    }

    public static void aufgabe8() {
        Scanner input = new Scanner(System.in);
        System.out.println("Gib den Speicherbedarf pro Pixel in Byte!");
        double proPixel = input.nextDouble();
        System.out.println("Gib die Länge des Bildes in Pixel ein!");
        double laenge = input.nextDouble();
        System.out.println("Gib die Breite des Bildes in Pixel ein!");
        double breite = input.nextDouble();
        System.out.println("Gib die Anzahl der Bilder ein!");
        double anzahlBilder = input.nextDouble();
        double speicherPlatzBedarf =(((laenge*breite)*proPixel)*anzahlBilder);
        System.out.println("Speicherplatzbedarf:" + speicherPlatzBedarf);
    }

    public static void main(String[] args) {
        Hello();
//        aufgabe1();
//        aufgabe2();
//        aufgabe3();
//        aufgabe4();
//        aufgabe5();
//        aufgabe6();
//        aufgabe7();
//        aufgabe8();

    }
}
