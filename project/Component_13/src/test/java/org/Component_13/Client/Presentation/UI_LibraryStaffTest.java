package org.Component_13.Client.Presentation;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.Component_13.Client.Domain.Resource;
import org.Component_13.Client.Domain.ResourceControl;
import org.junit.jupiter.api.Test;

class UI_LibraryStaffTest {

	@Test
	void delegatesToResourceControl() {
		ResourceControl control = new ResourceControl();
		control.addResource(new Resource(10, "Thesis"));
		UI_LibraryStaff ui = new UI_LibraryStaff(control);

		String generalReport = ui.generateGeneralReport();
		String specificReport = ui.generateResourceSpecificReport(10);

		assertTrue(generalReport.contains("10 - Thesis"));
		assertTrue(specificReport.contains("Resource 10"));
	}
}
