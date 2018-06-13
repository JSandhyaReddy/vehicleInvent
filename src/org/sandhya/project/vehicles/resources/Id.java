package org.sandhya.project.vehicles.resources;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sandhya.project.vehicles.models.Response;
import org.sandhya.project.vehicles.models.VehicleSearch;
import org.sandhya.project.vehicles.service.VehicleService;

@Path("/id")
public class Id {
	private static Map<Long,VehicleSearch> vechiles = new HashMap<Long,VehicleSearch>();

	@GET
	@Produces(MediaType.APPLICATION_XML)

	public List<VehicleSearch> getVehicle() {
		return VehicleService.getAllVehicles();
	}
	
	@POST
	@Path("/add")
	public Response addVechile(VehicleSearch vechile) {
		Response response = new Response();
		if(vechiles.get(vechile.getId()) != null){
			response.setStatus(false);
			response.setMessage("vechile Already Exists");
			return response;
		}
		vechiles.put(vechile.getId(),vechile);
		response.setStatus(true);
		response.setMessage("vechile created successfully");
		return response;
	} 
	
	@GET
	@Path("/{id}/gettestVechile")
	public VehicleSearch gettestVechile(@PathParam("id") int id) {
		VehicleSearch vechile=new VehicleSearch();
		vechile.setId(id);
		vechile.setModel("Maruti");
		vechile.setOwner("x");
		vechile.setType("testsample");
		return vechile;
	}
@GET
@Path("/{id}/deletevechile")
public Response deleteVechile(@PathParam("id") int id){
	Response response = new Response();
	if(vechiles.get(id) == null){
		response.setStatus(false);
		response.setMessage("vechile Doesn't Exists");
		return response;
	}
	vechiles.remove(id);
	response.setStatus(true);
	response.setMessage("vechile deleted successfully");
	return response;
}

	
   
	
}
