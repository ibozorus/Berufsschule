package iek;

import java.util.Scanner;

public class LaolaAlgorithmus {

    public static void dezInDual(){

        System.out.println("Gib ein Int ein!");

        Scanner input = new Scanner(System.in);
        
        int dez = input.nextInt();
        
        String ergebnis = "";


        while(dez>=1){
            ergebnis = ergebnis + String.valueOf(dez % 2);
            dez = dez / 2;
        }
        
        String ergebnis2 = "";

        for(int i = ergebnis.length() - 1; i>=0;i--){
            ergebnis2 = ergebnis2 + ergebnis.charAt(i);
        }
        
        
        System.out.println(ergebnis2);



    }

    /*publ ic static void dualInDez(){
        System.out.println("Gib eine duale Zahl ein!");
        
        Scanner input = new Scanner(System.in);
        
        String dual = input.nextLine();
        
        double ergebnis = 0;

        int zaehler = 0;
        for(int i = dual.length() - 1; i>=0;i--){
            ergebnis = ergebnis + (Double.parseDouble(dual.charAt(i)) * Math.pow(2, zaehler ));
            zaehler ++;
        }

        System.out.println(ergebnis);
    } */

    public static void main(String[] args) {
       dezInDual();
       // dualInDez();

    }
}
