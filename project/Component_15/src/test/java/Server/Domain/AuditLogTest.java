package Server.Domain;

import static org.junit.Assert.*;
import org.junit.Test;

public class AuditLogTest {

    @Test
    public void testAuditLogCreation() {
        AuditLog log = new AuditLog(101, "TestUser", "Login");
        
        assertNotNull(log);
        String stringRep = log.toString();
        
        assertTrue(stringRep.contains("TestUser"));
        assertTrue(stringRep.contains("Login"));
    }
}