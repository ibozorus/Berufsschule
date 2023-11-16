package org.example;

public class JSONRestController implements IFunktionen {


    @Override
    public void connect() {
        showmessage(EMessageType.INFO, JSONRestController.class.getName() + " is connected");
    }

    @Override
    public String readdata() {

        showmessage(EMessageType.INPUT, "Reading JSON data");
        return "JSON Data";
    }

    @Override
    public void writedata() {
        showmessage(EMessageType.INFO, "Writing JSON data");
    }

    @Override
    public void disconnect() {
        showmessage(EMessageType.ALERT, JSONRestController.class.getName() + " is disconnected");

    }

    @Override
    public void showmessage(EMessageType messageType, String ausgabe) {
        System.out.println(messageType.toString() + ": JSONRestController " + ausgabe);
    }
}
