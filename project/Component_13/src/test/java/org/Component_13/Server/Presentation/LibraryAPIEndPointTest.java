package org.Component_13.Server.Presentation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.Component_13.Server.Domain.Permision;
import org.Component_13.Server.Domain.PermisionControl;
import org.Component_13.Server.Domain.Resource;
import org.Component_13.Server.Domain.ResourceControl;
import org.junit.jupiter.api.Test;

class LibraryAPIEndPointTest {

	@Test
	void returnsReportsWhenAuthorized() {
		ResourceControl resourceControl = new ResourceControl();
		resourceControl.addResource(new Resource(1, "Book"));
		Permision permision = new Permision(1);
		permision.authorize(42);
		LibraryAPIEndPoint endpoint = new LibraryAPIEndPoint(resourceControl, new PermisionControl(permision));

		String general = endpoint.generateGeneralReport(42);
		String specific = endpoint.generateResourceSpecificReport(42, 1);

		assertTrue(general.contains("Book"));
		assertTrue(specific.contains("Resource 1"));
	}

	@Test
	void deniesWhenUnauthorized() {
		ResourceControl resourceControl = new ResourceControl();
		Permision permision = new Permision(1);
		LibraryAPIEndPoint endpoint = new LibraryAPIEndPoint(resourceControl, new PermisionControl(permision));

		String general = endpoint.generateGeneralReport(7);
		String specific = endpoint.generateResourceSpecificReport(7, 99);

		assertEquals("Access denied", general);
		assertEquals("Access denied", specific);
	}
}
