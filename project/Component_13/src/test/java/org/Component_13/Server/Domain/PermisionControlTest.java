package org.Component_13.Server.Domain;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PermisionControlTest {

	@Test
	void allowsAuthorizedUser() {
		Permision permision = new Permision(1);
		permision.authorize(10);
		PermisionControl control = new PermisionControl(permision);

		assertTrue(control.checkPermision(10));
	}

	@Test
	void deniesUnauthorizedUser() {
		Permision permision = new Permision(1);
		permision.authorize(10);
		PermisionControl control = new PermisionControl(permision);

		assertFalse(control.checkPermision(11));
	}
}
