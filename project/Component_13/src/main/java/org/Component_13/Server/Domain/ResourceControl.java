package org.Component_13.Server.Domain;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/** In-memory resource controller for reporting operations. */
public class ResourceControl {

	private final Map<Integer, Resource> resources = new LinkedHashMap<>();

	public void addResource(Resource resource) {
		if (resource == null) {
			throw new IllegalArgumentException("resource cannot be null");
		}
		resources.put(resource.getId(), resource);
	}

	public Collection<Resource> getResources() {
		return resources.values();
	}

	public String generateReport(int resourceID) {
		Resource resource = resources.get(resourceID);
		if (resource == null) {
			return "Resource " + resourceID + " not found";
		}
		return String.format("Resource %d: %s", resource.getId(), resource.getTitle());
	}

	public String generateGeneralReport() {
		if (resources.isEmpty()) {
			return "No resources available";
		}
		return resources.values()
			.stream()
			.map(r -> String.format("%d - %s", r.getId(), r.getTitle()))
			.collect(Collectors.joining(", "));
	}
}