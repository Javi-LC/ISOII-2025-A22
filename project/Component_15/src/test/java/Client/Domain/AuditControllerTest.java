package org.Component_15.Client.Domain;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import Client.Domain.AuditController;
import Client.Domain.AuditLog;

import java.util.List;

public class AuditControllerTest {

    private AuditController controller;

    @Before
    public void setUp() {
        controller = new AuditController();
    }

    @Test
    public void testRecordAction() {
        // Probamos que no lance excepciones al guardar
        try {
            controller.recordAction("admin", "Test Action");
            assertTrue(true);
        } catch (Exception e) {
            fail("Should not throw exception");
        }
    }

    @Test
    public void testGetAuditLogs() {
        List<AuditLog> logs = controller.getAuditLogs();
        assertNotNull("Log list should not be null", logs);
        assertFalse("Log list should not be empty", logs.isEmpty());
        assertEquals("Should retrieve 2 simulated logs", 2, logs.size());
    }
}