package com.example.component6.client.presentation;

public class ClientController {
    private final com.example.component6.client.domain.ClientModel model;

    public ClientController(com.example.component6.client.domain.ClientModel model) {
        this.model = model;
    }

    public String present() {
        return "Client: " + model.getName();
    }
}
