package org.Component_13.Client.Domain;

/** Simple value object describing a library resource. */
public class Resource {

	private final int id;
	private final String title;

	public Resource(int id, String title) {
		this.id = id;
		this.title = title == null ? "" : title;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
}