package iek;

import java.util.Scanner;

public class portoermittlung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Geben Sie das Gewicht ein!");
            System.out.println("Um das Programm zu beenden geben Sie 0(Null) ein!");
            double gewicht = input.nextDouble();

            if(gewicht ==0){
                System.out.println("Das Programm wird gestoppt!");
                break;
            }
            else if(gewicht>1000 || gewicht <0){
                System.out.println("Ungültiger Wert! Versuchen Sie es nochmal!");
            }
           else if(gewicht <= 20){
                System.out.println("Porto:1,00 Euro");
            }
            else if (gewicht <=50){
                System.out.println("Porto:1,70 Euro");
            }
            else if(gewicht <= 100){
                System.out.println("Porto:2,40 Euro");
            }
            else if(gewicht <= 250){
                System.out.println("Porto:3,20 Euro");
            }
            else if(gewicht <= 500){
                System.out.println("Porto:4,00 Euro");
            }
            else if(gewicht <= 1000){
                System.out.println("Porto:4,80 Euro");
            }
        }


    }
}
