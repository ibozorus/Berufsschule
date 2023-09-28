package org.example;

public enum EBedienart {
    TOUCH("Touch Display"),
    TASTE("Tastenbedienung");

    private final String description;

    EBedienart(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
