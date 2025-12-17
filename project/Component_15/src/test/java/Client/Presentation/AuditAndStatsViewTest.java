package org.Component_15.Client.Presentation;

import static org.junit.Assert.*;
import org.junit.Test;

public class AuditAndStatsViewTest {

    @Test
    public void testViewExecution() {
        AuditAndStatsView view = new AuditAndStatsView();
        
        try {
            // Ejecutamos los métodos para asegurar que no hay NullPointerExceptions
            // ni errores de enlazado con los controladores.
            view.displayDashboard();
            view.showStats(); // Esto imprimirá en consola durante el test
            view.showAuditLog();
            
            assertTrue(true); // Si llega aquí, pasó el test
        } catch (Exception e) {
            fail("UI threw an exception: " + e.getMessage());
        }
    }
}