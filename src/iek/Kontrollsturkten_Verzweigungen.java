package iek;

import java.util.Scanner;

public class Kontrollsturkten_Verzweigungen {
    public static void transaktion1(){
        System.out.println("Geben Sie bitte Ihre Nettoabnahmemenge pro Jahr ein!");
        Scanner input = new Scanner(System.in);
        double nettoabnahmemenge = input.nextDouble();
        if (nettoabnahmemenge>70000){
            double bonus = (nettoabnahmemenge*5)/100;
            System.out.println("Ihr Bonus beträgt "+ bonus);
        }
        else {
            System.out.println("Ihre Bruttoabnahmemenge reicht leider nicht aus um einen Bonus zu bekommen");
        }
    }
    public static void transaktion2(){

        System.out.println("Geben Sie bitte Ihre Festgeldanlage ein!");
        Scanner input = new Scanner(System.in);
        double festgeldanlage = input.nextDouble();
        double zins = 0;
        if(festgeldanlage<=5000){
            zins = (festgeldanlage*2)/100;
        }
        else if(festgeldanlage<=10000){
            zins = (festgeldanlage*2.25)/100;
        }
        else if(festgeldanlage<=50000){
            zins = (festgeldanlage*2.5)/100;
        }

        else if(festgeldanlage>50000){
            zins = (festgeldanlage*2.75)/100;
        }
        System.out.println("Der Zins beträgt "+zins);
    }
    public static void transaktion3(){
        double brutto;
    while(true){
            System.out.println("Geben Sie bitte den Stundenlohn ein!(Max. 50 Euro)");
            Scanner lohnInput = new Scanner(System.in);
            double stundenlohn = lohnInput.nextDouble();
            System.out.println("Geben Sie bitte die Arbeitsstunden ein!(Max. 80 Stunden)");
            Scanner arbeitsstundenInput = new Scanner(System.in);
            double arbeitsstunden = arbeitsstundenInput.nextDouble();

            if(stundenlohn > 80 || arbeitsstunden> 50){
            System.out.println("Unerlaubte Eingabe! \nBitte versuchen Sie es nochmal!");
            break;
           }

            double extraArbeitsstundenanSonn = 0;
            if(arbeitsstunden>35){
                System.out.println("Geben Sie bitte ein, wie viel Stunden der Überstunden Sie am Sonntag oder Feiertagen gearbeitet haben.");
                Scanner extraArbeitsstundenanSonnInput = new Scanner(System.in);
                extraArbeitsstundenanSonn = extraArbeitsstundenanSonnInput.nextDouble();
            }



            if(arbeitsstunden<35){
                brutto = arbeitsstunden*stundenlohn;
                System.out.println("Der Bruttolohn beträgt "+ brutto);
                break;
            }
            else {
                brutto = (35*stundenlohn) + (((arbeitsstunden-35-extraArbeitsstundenanSonn)*(stundenlohn*1.5))) + (extraArbeitsstundenanSonn*stundenlohn*1.75);
                System.out.println("Der Bruttolohn beträgt "+ brutto);
                break;
            }


    }



    }
    public static void main(String[] args) {
        System.out.println("\n"+"1:Nettoabnahmemenge\n2:Festgeldanlage\n" +
                "3:Bruttolohn\n4:(Un)gerade\n5:Größte Zahl\n6:Jahreszahl"+"\nBitte geben Sie die Zahl ihrer Transaktion ein! ");

        Scanner input = new Scanner(System.in);
        int trannummer = input.nextInt();
        switch (trannummer) {
            case 1: transaktion1();
            case 2: transaktion2();
            case 3: transaktion3();
        }
    }
}
