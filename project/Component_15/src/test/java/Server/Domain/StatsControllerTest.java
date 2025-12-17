package Server.Domain;

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
    public void testCalculateGlobalStats() {
        StatisticsReport report = controller.calculateGlobalStats();
        
        assertNotNull("Report object should be created", report);
        
        // Verify contents (based on mock data: 150 loans, 45 users)
        String content = report.toString();
        assertTrue("Should contain loan count", content.contains("150"));
        assertTrue("Should contain user count", content.contains("45"));
    }
}