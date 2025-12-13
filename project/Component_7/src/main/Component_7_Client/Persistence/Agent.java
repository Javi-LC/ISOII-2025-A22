package org.Component_7_Client.Persistence;

public class Agent {
    
    // Simula la conexión con el servidor (Broker)
    public boolean sendSubscriptionRequest(int projectId, int resourceId) {
        System.out.println(" [Agent] Sending request to Server for ProjID: " + projectId + ", ResID: " + resourceId);
        
        // Aquí iría la lógica real de red (Sockets, RMI, HTTP).
        // Simulamos que siempre devuelve true para el test.
        return true; 
    }
}