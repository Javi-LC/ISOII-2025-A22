package org.Component_13.Server.Domain;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/** Represents a permission granting access to certain user IDs. */
public class Permision {

	private final int id;
	private final Set<Integer> authorizedUserIds = new LinkedHashSet<>();

	public Permision(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void authorize(int userId) {
		authorizedUserIds.add(userId);
	}

	public boolean isAuthorized(int userId) {
		return authorizedUserIds.contains(userId);
	}

	public Set<Integer> getAuthorizedUserIds() {
		return Collections.unmodifiableSet(authorizedUserIds);
	}
}