package Client.Presentation;

import java.util.List;

import Client.Domain.AuditController;
import Client.Domain.AuditLog;
import Client.Domain.StatisticsReport;
import Client.Domain.StatsController;

public class AuditAndStatsView {
    
    private AuditController auditController;
    private StatsController statsController;

    public AuditAndStatsView() {
        this.auditController = new AuditController();
        this.statsController = new StatsController();
    }

    public void displayDashboard() {
        System.out.println("\n--- ADMINISTRATOR DASHBOARD ---");
        System.out.println("1. View Global Statistics (FR.28)");
        System.out.println("2. View Audit Logs (FR.26)");
    }

    public void showStats() {
        System.out.println("\n[UI] Generating Report...");
        StatisticsReport report = statsController.getGlobalStats();
        System.out.println(report.toString());
    }

    public void showAuditLog() {
        System.out.println("\n[UI] Fetching Logs...");
        List<AuditLog> logs = auditController.retrieveLogs();
        for (AuditLog log : logs) {
            System.out.println(log);
        }
    }
    
    // Método main temporal para probar y sacar la captura de pantalla
    public static void main(String[] args) {
        AuditAndStatsView view = new AuditAndStatsView();
        view.displayDashboard();
        view.showStats();
        view.showAuditLog();
    }
}