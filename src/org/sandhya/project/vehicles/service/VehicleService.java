package org.sandhya.project.vehicles.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.sandhya.project.vehicles.database.database;
import org.sandhya.project.vehicles.models.VehicleSearch;

public class VehicleService {
	private static Map<Long, VehicleSearch> vehiclesearch = database.getVehicles();

	public VehicleService() {
		vehiclesearch.put(1l, new VehicleSearch(150, "car", "suv", "sandhya"));
		vehiclesearch.put(2l, new VehicleSearch(151, "boat", "aa", "shashi"));
	}

	public static List<VehicleSearch> getAllVehicles() {
		return new ArrayList<VehicleSearch>(vehiclesearch.values());

	}

	public VehicleSearch getVehicle(long id) {
		return vehiclesearch.get(id);
	}

	public VehicleSearch addVehicle(VehicleSearch v) {
		v.setId(vehiclesearch.size() + 1);
		vehiclesearch.put(v.getId(), v);
		return v;
	}

	public VehicleSearch updateVehicle(VehicleSearch v) {
		if (v.getId() <= 0) {
			return null;
		}
		vehiclesearch.put(v.getId(), v);
		return v;
	}

	public VehicleSearch removeVehicle(long id) {
		return vehiclesearch.remove(id);
	}
}