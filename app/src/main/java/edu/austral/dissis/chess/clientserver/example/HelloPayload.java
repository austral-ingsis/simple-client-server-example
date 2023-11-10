package edu.austral.dissis.chess.clientserver.example;

public record HelloPayload(String name) {
    @Override
    public String toString() {
        return "Hello " + name();
    }
}
