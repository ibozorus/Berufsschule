package org.example;

import java.util.Date;

public abstract class Person {
    private String name;
    private String vorname;
    private String anrede;
    private Date geburtsDatum;

    public Person(String name, String vorname, String anrede, Date geburtsDatum) {
        this.name = name;
        this.vorname = vorname;
        this.anrede = anrede;
        this.geburtsDatum = geburtsDatum;
    }

    public abstract void sterben();
}
