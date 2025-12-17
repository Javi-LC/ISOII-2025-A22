package Server.Persistance;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Vector;

public class BrokerTest {

    @Test
    public void testSingletonPattern() {
        Broker b1 = Broker.getBroker();
        Broker b2 = Broker.getBroker();
        
        assertNotNull(b1);
        assertEquals("Broker must return the same instance", b1, b2);
    }

    @Test
    public void testInsertOperation() {
        Broker broker = Broker.getBroker();
        boolean result = broker.insert("INSERT INTO AuditLog VALUES (1, 'test')");
        
        assertTrue("Insert should return true", result);
    }

    @Test
    public void testSelectOperation() {
        Broker broker = Broker.getBroker();
        Vector<Object> result = broker.select("SELECT * FROM AuditLog");
        
        assertNotNull("Select result should not be null", result);
        // Mock implementation returns empty vector
        assertTrue(result.isEmpty());
    }
}