package org.Component_7_Server.Domain;

import org.Component_7_Server.Persistence.Broker;

public class SubscriptionController {

    private final Broker broker;
    private ResearchController researchController;

    public SubscriptionController() {
        this.broker = new Broker();
        this.researchController = new ResearchController();
    }

    public boolean createSubscription(int projectId, int resourceId) {
        // 1. Validar si el proyecto tiene acceso/fondos
        if (!researchController.validateAccess(projectId)) {
            System.out.println(" [Domain] Access denied for project " + projectId);
            return false;
        }

        // 2. Crear la suscripción
        Subscription newSub = new Subscription(projectId, resourceId);
        
        // 3. Persistir en la base de datos
        String sql = "INSERT INTO subscriptions (project_id, resource_id) VALUES (" + projectId + ", " + resourceId + ")";
        return broker.insert(sql);
    }
}