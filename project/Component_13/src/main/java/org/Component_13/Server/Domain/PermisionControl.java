package org.Component_13.Server.Domain;

/** Checks permissions against a provided permission object. */
public class PermisionControl {

	private final Permision permision;

	public PermisionControl(Permision permision) {
		this.permision = permision;
	}

	public boolean checkPermision(int userId) {
		return permision != null && permision.isAuthorized(userId);
	}
}