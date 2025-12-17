package Server.Presentation;

import java.util.List;

import Server.Domain.AuditController;
import Server.Domain.AuditLog;
import Server.Domain.StatisticsReport;
import Server.Domain.StatsController;

public class SystemClientUI {
    
    // Controladores del Componente 15
    private AuditController auditController;
    private StatsController statsController;

    public SystemClientUI() {
        // Inicializamos los controladores del dominio
        this.auditController = new AuditController();
        this.statsController = new StatsController();
    }

    // --- FR.28: Generate Global Statistics ---
    public StatisticsReport getGlobalStats() {
        System.out.println("[Server-UI] Incoming request: Calculate Global Statistics");
        // Delegamos la tarea al controlador del dominio
        return statsController.calculateGlobalStats();
    }

    // --- FR.26: Audit Activities ---
    public List<AuditLog> getAuditLogs() {
        System.out.println("[Server-UI] Incoming request: Retrieve Audit Logs");
        // Delegamos la tarea al controlador del dominio
        return auditController.getAuditLogs();
    }

    // Método main para SIMULAR que el servidor está corriendo y procesando peticiones.
    // Úsalo para sacar la captura de pantalla de "Execution Output".
    public static void main(String[] args) {
        System.out.println(">>> SERVER LISTENING ON PORT 8080 <<<");
        
        SystemClientUI serverInterface = new SystemClientUI();

        // 1. Simulación: Llega una petición de Estadísticas
        System.out.println("\n--- Processing Request 1 ---");
        StatisticsReport report = serverInterface.getGlobalStats();
        System.out.println(">> Response sent to client: " + report.toString());

        // 2. Simulación: Llega una petición de Auditoría
        System.out.println("\n--- Processing Request 2 ---");
        List<AuditLog> logs = serverInterface.getAuditLogs();
        System.out.println(">> Response sent to client: " + logs.size() + " logs retrieved.");
        
        System.out.println("\n>>> SERVER WAITING FOR NEXT REQUEST <<<");
    }
}