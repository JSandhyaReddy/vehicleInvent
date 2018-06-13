package org.sandhya.project.vehicles.database;

import java.util.HashMap;
import java.util.Map;

import org.sandhya.project.vehicles.models.VehicleSearch;
import org.sandhya.project.vehicles.models.insurance;

public class database {
	private static Map<Long, VehicleSearch> vehiclesearch = new HashMap<>();
	private static Map<Long, insurance> ins = new HashMap<>();

	public static Map<Long, VehicleSearch> getVehicles() {
		return vehiclesearch;

	}

	public static Map<Long, insurance> getInsurance() {
		return ins;

	}
}
