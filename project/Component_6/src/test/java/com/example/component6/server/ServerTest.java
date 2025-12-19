package com.example.component6.server;

import com.example.component6.server.domain.ServerModel;
import com.example.component6.server.presentation.ServerController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ServerTest {
    @Test
    public void testStatus() {
        ServerModel model = new ServerModel("S1");
        ServerController controller = new ServerController(model);
        assertTrue(controller.status().contains("S1"));
    }
}
