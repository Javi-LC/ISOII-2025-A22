package com.example.component6.client.persistence;

import java.util.Optional;

public class ClientRepository {
    public Optional<String> findClientName() {
        return Optional.of("DemoClient");
    }
}
