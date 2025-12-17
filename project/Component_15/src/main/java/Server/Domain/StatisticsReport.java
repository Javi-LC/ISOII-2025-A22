package Server.Domain;

public class StatisticsReport {
    private int totalLoans;
    private int activeUsers;
    private int overdueItems;

    public StatisticsReport(int totalLoans, int activeUsers, int overdueItems) {
        this.totalLoans = totalLoans;
        this.activeUsers = activeUsers;
        this.overdueItems = overdueItems;
    }

    @Override
    public String toString() {
        return "=== GLOBAL STATS ===\nTotal Loans: " + totalLoans + 
               "\nActive Users: " + activeUsers + 
               "\nOverdue Items: " + overdueItems;
    }
}