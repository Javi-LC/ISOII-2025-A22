package Server.Domain;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class AuditControllerTest {

    private AuditController controller;

    @Before
    public void setUp() {
        controller = new AuditController();
    }

    @Test
    public void testRecordAction() {
        // Ensure recording an action doesn't throw an exception (mock DB)
        try {
            controller.recordAction("admin", "Delete Book");
            assertTrue(true); 
        } catch (Exception e) {
            fail("Exception thrown during recordAction: " + e.getMessage());
        }
    }

    @Test
    public void testGetAuditLogs() {
        List<AuditLog> logs = controller.getAuditLogs();
        
        assertNotNull("List should not be null", logs);
        assertFalse("List should not be empty", logs.isEmpty());
        // Based on the mock implementation, we expect 2 logs
        assertEquals(2, logs.size());
    }
}