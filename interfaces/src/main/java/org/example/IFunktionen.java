package org.example;

public interface IFunktionen {

    public void connect();
    public String readdata();
    public void writedata();
    public void disconnect();
    public void showmessage(EMessageType message, String ausgabe);
}
