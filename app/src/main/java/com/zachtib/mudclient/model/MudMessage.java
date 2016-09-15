package com.zachtib.mudclient.model;

public class MudMessage {
    String Guid;
    String OutBoundMessage;
    String InBoundMessage;

    public MudMessage() {
        Guid = "";
        OutBoundMessage = "";
        InBoundMessage = "";
    }

    public MudMessage(String guid, String outBoundMessage, String inBoundMessage) {
        Guid = guid;
        OutBoundMessage = outBoundMessage;
        InBoundMessage = inBoundMessage;
    }

    public String getGuid() {
        return Guid;
    }

    public void setGuid(String guid) {
        Guid = guid;
    }

    public String getOutBoundMessage() {
        return OutBoundMessage;
    }

    public void setOutBoundMessage(String outBoundMessage) {
        OutBoundMessage = outBoundMessage;
    }

    public String getInBoundMessage() {
        return InBoundMessage;
    }

    public void setInBoundMessage(String inBoundMessage) {
        InBoundMessage = inBoundMessage;
    }
}
