package org.Component_13.Client.Persistance;

/** Simple persistence agent exposing a proxy placeholder. */
public class Agent {

	private final Proxy proxy;

	public Agent() {
		this(new Proxy());
	}

	public Agent(Proxy proxy) {
		this.proxy = proxy;
	}

	public Proxy getProxy() {
		return proxy;
	}
}