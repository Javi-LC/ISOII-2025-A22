package org.Component_7_Server.Presentation;

import org.Component_7_Server.Domain.SubscriptionController;

public class ServerClientUI {
    
    private final SubscriptionController subController;

    public ServerClientUI() {
        this.subController = new SubscriptionController();
    }

    // Este método sería llamado cuando llega una petición de red
    public boolean subscribeProjectToResource(int projectId, int resourceId) {
        System.out.println(" [ServerUI] Received subscription request.");
        return subController.createSubscription(projectId, resourceId);
    }
}