package org.Component_13.Client.Presentation;

import org.Component_13.Client.Domain.ResourceControl;

/** UI entry point for library staff reporting actions. */
public class UI_LibraryStaff {

	private final ResourceControl resourceControl;

	public UI_LibraryStaff(ResourceControl resourceControl) {
		this.resourceControl = resourceControl;
	}

	public String generateGeneralReport() {
		return resourceControl.generateGeneralReport();
	}

	public String generateResourceSpecificReport(int resourceID) {
		return resourceControl.generateReport(resourceID);
	}
}