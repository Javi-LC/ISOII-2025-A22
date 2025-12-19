package org.Component_13.Server.Persistance;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BrokerTest {

	@Test
	void connectAndQuery() {
		Broker broker = new Broker();
		broker.connect();

		assertTrue(broker.isConnected());
		assertTrue(broker.query("SELECT 1"));
	}

	@Test
	void queryFailsWhenDisconnected() {
		Broker broker = new Broker();

		assertFalse(broker.query("SELECT 1"));
		assertFalse(broker.isConnected());
	}

	@Test
	void queryFailsWithEmptySql() {
		Broker broker = new Broker();
		broker.connect();

		assertFalse(broker.query("   "));
	}
}
