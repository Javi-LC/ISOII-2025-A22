package org.Component_7_Client.Domain;

import org.Component_7_Client.Persistence.Agent;

public class SubscriptionController {

    private final Agent agent;

    public SubscriptionController() {
        this.agent = new Agent();
    }

    public boolean requestSubscription(int projectId, int resourceId) {
        // Lógica de negocio del cliente
        // Delegar la comunicación al Agente
        try {
            return agent.sendSubscriptionRequest(projectId, resourceId);
        } catch (Exception e) {
            System.err.println("Communication error: " + e.getMessage());
            return false;
        }
    }
}