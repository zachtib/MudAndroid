package com.zachtib.mudclient;

import com.zachtib.mudclient.model.MudMessage;
import com.zachtib.mudclient.telnet.TelnetClient;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testMudMessageCreation() throws Exception {
        MudMessage message = new MudMessage("asdf1234", "Hello", "Goodbye");
    }

    @Test
    public void testTelnetWriter() throws Exception {
        MudMessage message = new MudMessage("asdf1234", "Hello", "Goodbye");
        TelnetClient client = new TelnetClient("127.0.0.1", 1234);
        client.sendMessage(message);
        client.sendMessage(message);
        client.sendMessage(message);
    }

    @Test
    public void testTelnetReader() throws Exception {
        TelnetClient client = new TelnetClient("127.0.0.1", 1234);
        MudMessage message = client.getMessage();
    }
}