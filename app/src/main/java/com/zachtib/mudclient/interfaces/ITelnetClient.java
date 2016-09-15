package com.zachtib.mudclient.interfaces;

import com.zachtib.mudclient.model.MudMessage;

import java.io.IOException;

public interface ITelnetClient {
    MudMessage getMessage() throws Exception;
    void sendMessage(MudMessage message) throws Exception;
}
