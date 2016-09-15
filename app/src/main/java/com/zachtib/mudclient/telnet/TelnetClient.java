package com.zachtib.mudclient.telnet;

import com.zachtib.mudclient.interfaces.ITelnetClient;
import com.zachtib.mudclient.model.MudMessage;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TelnetClient implements ITelnetClient {

    private Socket socket;
    private BufferedReader input;
    private PrintWriter output;
    Serializer serializer;

    private boolean isConnected;

    public TelnetClient(String server, int port) {
        serializer = new Persister();
        isConnected = false;
        try {
            socket = new Socket(server, port);
            input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            output = new PrintWriter(socket.getOutputStream(), true);
            isConnected = true;
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public MudMessage getMessage() throws Exception {
        return serializer.read(MudMessage.class, input);
    }

    public void sendMessage(MudMessage message) throws Exception {
        serializer.write(message, output);
    }
}
