package org.example;

public class XMLRestController implements IFunktionen {


    @Override
    public void connect() {
        showmessage(EMessageType.INFO, JSONRestController.class.getName() + " is connected");
    }

    @Override
    public String readdata() {

        showmessage(EMessageType.INPUT, "Reading XML data");
        return "XML Data";
    }

    @Override
    public void writedata() {
        showmessage(EMessageType.INFO, "Writing XML data");
    }

    @Override
    public void disconnect() {
        showmessage(EMessageType.ALERT, XMLRestController.class.getName() + " is disconnected");

    }

    @Override
    public void showmessage(EMessageType messageType, String ausgabe) {
        System.out.println(messageType.toString() + ": XMLRestController " + ausgabe);
    }
}
