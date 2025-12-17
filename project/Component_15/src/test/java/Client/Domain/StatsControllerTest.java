package Client.Domain;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StatsControllerTest {

    private StatsController controller;

    @Before
    public void setUp() {
        controller = new StatsController();
    }

    @Test
    public void testGetGlobalStatsFromProxy() {
        StatisticsReport report = controller.getGlobalStats();
        assertNotNull("Client controller should receive report", report);
        System.out.println("Client Test Report: " + report.toString());
    }
}