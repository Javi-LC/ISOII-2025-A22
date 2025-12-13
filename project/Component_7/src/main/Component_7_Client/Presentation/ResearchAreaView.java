package org.Component_7_Client.Presentation;

import org.Component_7_Client.Domain.SubscriptionController;

public class ResearchAreaView {
    
    private final SubscriptionController controller;

    public ResearchAreaView() {
        this.controller = new SubscriptionController();
    }

    public void displayProjects() {
        System.out.println("=== RESEARCHER DASHBOARD ===");
        System.out.println("1. Project A (ID: 101) - Budget: High");
        System.out.println("2. Project B (ID: 102) - Budget: Low");
    }

    public void requestSubscription(int projectId, int resourceId) {
        System.out.println("Requesting subscription for Project " + projectId + " to Resource " + resourceId + "...");
        boolean success = controller.requestSubscription(projectId, resourceId);
        
        if (success) {
            showSuccess();
        } else {
            showError();
        }
    }

    public void showSuccess() {
        System.out.println("[SUCCESS] Subscription added successfully!");
    }

    public void showError() {
        System.out.println("[ERROR] Could not process subscription. Check funds or permissions.");
    }

    // Método main para probar la vista independientemente
    public static void main(String[] args) {
        ResearchAreaView view = new ResearchAreaView();
        view.displayProjects();
        // Simulación de interacción
        view.requestSubscription(101, 500);
    }
}