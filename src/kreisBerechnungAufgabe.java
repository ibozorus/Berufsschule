import java.util.Scanner;

public class kreisBerechnungAufgabe {
    public static void main(String[] args) {
//        final  double pi = 3.14159265;
        //wenn ich die PI-Zahl von Math,PI nehme, ist das Ergebnis genauer.
        double pi = Math.PI;
        Scanner durchmessereing = new Scanner(System.in);

        System.out.print("Bitte Durchmesser eingeben: ");
        double durchmesser = durchmessereing.nextDouble();
        double ergebnis = pi*durchmesser/2*durchmesser/2;
        System.out.print("Die Kreisfläche lautet: " + ergebnis);
    }
}
