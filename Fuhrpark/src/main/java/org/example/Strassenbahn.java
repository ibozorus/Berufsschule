package org.example;

public class Strassenbahn {

    private int linie;
    private boolean modus;
    private int maxPassagiere;
    private int passagiere;

    public Strassenbahn(int linie, int maxPassagiere) {
        this.linie = linie;
        this.maxPassagiere = maxPassagiere;
        this.passagiere = 0;
        this.modus = false;
    }

    public int anzeige() {
        return linie;
    }

    public int getPassagiere() {
        return passagiere;
    }

    public void fahren() {
        if (!modus) {
            modus = true;
            System.out.println("Die Bahn fährt los");
        } else {
            System.out.println("Die Bahn fährt schon");
        }


    }

    public void halten() {
        if (modus) {
            System.out.println("Die Bahn stoppt");
            modus = false;
        } else {
            System.out.println("Die Bahn hält schon");
        }


    }

    public void einsteigen(int einPassagiere) {
        if (!modus) {

            if (einPassagiere + this.passagiere <= this.maxPassagiere) {
                this.passagiere += einPassagiere;
                System.out.println(einPassagiere + " steigen ein");
            } else {
                int insgesamtPassagiere = einPassagiere;
                einPassagiere = this.maxPassagiere - this.passagiere;
                this.passagiere = this.maxPassagiere;
                System.out.println("Von " + insgesamtPassagiere + " Passagieren" +
                        " konnten" + einPassagiere + " einsteigen");

            }
        } else {
            System.out.println("Während der Fahrt ist kein Einstieg möglich!");
        }
    }

    public void aussteigen(int ausPassagiere) {
        if (!modus) {
            if (ausPassagiere > this.passagiere) {
                System.out.println("ZORT");
            } else {
                this.passagiere -= ausPassagiere;

            }

        } else {
            System.out.println("Während der Fahrt ist kein Ausstieg möglich!");
        }
    }
}
