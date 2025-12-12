package org.Component_13.Client.Persistance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class AgentTest {

	@Test
	void returnsProxyInstance() {
		Agent agent = new Agent();

		Proxy proxy = agent.getProxy();

		assertNotNull(proxy);
		assertEquals("OK", proxy.ping());
	}
}
