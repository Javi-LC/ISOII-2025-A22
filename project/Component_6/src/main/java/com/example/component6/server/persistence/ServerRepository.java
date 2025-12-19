package com.example.component6.server.persistence;

import java.util.Optional;

public class ServerRepository {
    public Optional<String> findServerId() {
        return Optional.of("Server-1");
    }
}
