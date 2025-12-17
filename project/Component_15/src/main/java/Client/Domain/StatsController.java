package Client.Domain;

import Client.Persistance.Agent;

public class StatsController {

    public StatisticsReport getGlobalStats() {
        // En un sistema real, esto llama a Agent.getProxy().send("getStats")...
        // Simulamos que recibimos el objeto del servidor
        System.out.println("-> Requesting Stats from Server...");
        return new StatisticsReport(150, 45, 12); // Dato simulado recibido
    }
}