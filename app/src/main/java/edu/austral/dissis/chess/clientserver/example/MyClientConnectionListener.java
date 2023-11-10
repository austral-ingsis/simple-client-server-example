package edu.austral.dissis.chess.clientserver.example;

import edu.austral.ingsis.clientserver.ClientConnectionListener;

public class MyClientConnectionListener implements ClientConnectionListener {

    @Override
    public void handleConnection() {
        System.out.println("Client has connected to server");
    }

    @Override
    public void handleConnectionClosed() {
        System.out.println("Client was disconnected from server");
    }
}
