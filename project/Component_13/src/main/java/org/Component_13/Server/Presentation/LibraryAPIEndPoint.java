package org.Component_13.Server.Presentation;

import org.Component_13.Server.Domain.PermisionControl;
import org.Component_13.Server.Domain.ResourceControl;

/** Presentation endpoint that delegates reporting to the domain layer. */
public class LibraryAPIEndPoint {

	private final ResourceControl resourceControl;
	private final PermisionControl permisionControl;

	public LibraryAPIEndPoint(ResourceControl resourceControl, PermisionControl permisionControl) {
		this.resourceControl = resourceControl;
		this.permisionControl = permisionControl;
	}

	public String generateGeneralReport(int userId) {
		if (!permisionControl.checkPermision(userId)) {
			return showErrorMessage();
		}
		return resourceControl.generateGeneralReport();
	}

	public String generateResourceSpecificReport(int userId, int resourceID) {
		if (!permisionControl.checkPermision(userId)) {
			return showErrorMessage();
		}
		return resourceControl.generateReport(resourceID);
	}

	public String showErrorMessage() {
		return "Access denied";
	}
}