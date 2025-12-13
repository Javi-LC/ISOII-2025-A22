package org.Component_13.Server.Persistance;

/** Minimal broker stub to simulate DB connectivity. */
public class Broker {

	private boolean connected;

	public void connect() {
		connected = true;
	}

	public void disconnect() {
		connected = false;
	}

	public boolean isConnected() {
		return connected;
	}

	public boolean query(String sql) {
		if (!connected) {
			return false;
		}
		return sql != null && !sql.trim().isEmpty();
	}
}