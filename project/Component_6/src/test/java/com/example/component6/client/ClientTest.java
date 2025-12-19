package com.example.component6.client;

import com.example.component6.client.domain.ClientModel;
import com.example.component6.client.presentation.ClientController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClientTest {
    @Test
    public void testPresentation() {
        ClientModel model = new ClientModel("Alice");
        ClientController controller = new ClientController(model);
        assertTrue(controller.present().contains("Alice"));
    }
}
