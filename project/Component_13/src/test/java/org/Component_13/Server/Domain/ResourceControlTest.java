package org.Component_13.Server.Domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ResourceControlTest {

	@Test
	void generatesGeneralReportWithResources() {
		ResourceControl control = new ResourceControl();
		control.addResource(new Resource(1, "Book"));
		control.addResource(new Resource(2, "Magazine"));

		String report = control.generateGeneralReport();

		assertTrue(report.contains("1 - Book"));
		assertTrue(report.contains("2 - Magazine"));
	}

	@Test
	void reportsMissingResource() {
		ResourceControl control = new ResourceControl();

		String report = control.generateReport(99);

		assertEquals("Resource 99 not found", report);
	}
}
