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

    public static void main(String[] args) {
        dezInDual();

    }
}
