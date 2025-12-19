package com.example.component6.server.presentation;

public class ServerController {
    private final com.example.component6.server.domain.ServerModel model;

    public ServerController(com.example.component6.server.domain.ServerModel model) {
        this.model = model;
    }

    public String status() {
        return "Server: " + model.getId();
    }
}
