package org.example;

public enum EConnectivitiy {
    USB("Universal Serial Bus"),
    WLAN("Wirelass Local Area Network"),
    LAN("Local Area Network");

    private final String description;

    EConnectivitiy(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
