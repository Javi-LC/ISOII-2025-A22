package Server.Presentation;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import Server.Domain.StatisticsReport;
import Server.Domain.AuditLog;
import java.util.List;

public class SystemClientUITest {

    private SystemClientUI serverUI;

    @Before
    public void setUp() {
        serverUI = new SystemClientUI();
    }

    @Test
    public void testGetGlobalStatsFlow() {
        // Test the flow from UI -> StatsController -> Report
        StatisticsReport report = serverUI.getGlobalStats();
        assertNotNull("UI should return a valid report", report);
    }

    @Test
    public void testGetAuditLogsFlow() {
        // Test the flow from UI -> AuditController -> Log List
        List<AuditLog> logs = serverUI.getAuditLogs();
        assertNotNull("UI should return a valid list", logs);
        assertTrue("List should contain data", logs.size() > 0);
    }
}