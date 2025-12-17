package Server.Domain;

import Server.Persistance.Broker;

public class StatsController {

    public StatisticsReport calculateGlobalStats() {
        // Simulamos llamadas al Broker para contar registros
        Broker broker = Broker.getBroker();
        
        // En código real: int loans = (int) broker.select("SELECT COUNT(*) FROM Loans").get(0);
        // Simulamos datos:
        int totalLoans = 150; 
        int activeUsers = 45;
        int overdueItems = 12;

        return new StatisticsReport(totalLoans, activeUsers, overdueItems);
    }
}