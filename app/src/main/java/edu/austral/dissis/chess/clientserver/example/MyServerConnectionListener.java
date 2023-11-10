package edu.austral.dissis.chess.clientserver.example;

import edu.austral.ingsis.clientserver.ServerConnectionListener;
import org.jetbrains.annotations.NotNull;

public class MyServerConnectionListener implements ServerConnectionListener {

    @Override
    public void handleClientConnection(@NotNull String clientId) {
        System.out.println("Client connected with id " + clientId);
    }

    @Override
    public void handleClientConnectionClosed(@NotNull String clientId) {
        System.out.println("Client with id " + clientId + " disconnected");

    }
}
