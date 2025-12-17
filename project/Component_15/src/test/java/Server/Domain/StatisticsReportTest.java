package Server.Domain;

import static org.junit.Assert.*;
import org.junit.Test;

public class StatisticsReportTest {

    @Test
    public void testReportData() {
        StatisticsReport report = new StatisticsReport(100, 50, 5);
        
        assertNotNull(report);
        String output = report.toString();
        
        // Verify the data passed is in the output string
        assertTrue(output.contains("100")); // Total loans
        assertTrue(output.contains("50"));  // Active users
        assertTrue(output.contains("5"));   // Overdue
    }
}