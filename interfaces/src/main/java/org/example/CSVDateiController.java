package org.example;

public class CSVDateiController implements IFunktionen {

    @Override
    public void connect() {
        showmessage(EMessageType.INFO, "The File is found");
    }

    @Override
    public String readdata() {

        showmessage(EMessageType.INPUT, "Reading CSV data");
        return "CSV Data";
    }

    @Override
    public void writedata() {
        showmessage(EMessageType.INFO, "Writing CSV data");
    }

    @Override
    public void disconnect() {
        showmessage(EMessageType.ALERT, "File is no more available");

    }

    @Override
    public void showmessage(EMessageType messageType, String ausgabe) {
        System.out.println(messageType.toString() + ": CSVDateiController " + ausgabe);
    }
}
