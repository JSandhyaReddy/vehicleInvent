package org.sandhya.project.vehicles.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
//class name as  vehicle would make more sense than vechilcle search 
public class VehicleSearch {
	private long id;
	private String type;
	private String model;
	private String owner;

	public VehicleSearch() {

	}

	@Override
	public String toString() {
		return "VehicleSearch []";
	}

	public VehicleSearch(long id, String type, String model, String owner) {
		super();
		this.id = id;
		this.type = type;
		this.model = model;
		this.owner = owner;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
