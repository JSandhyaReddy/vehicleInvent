package org.sandhya.project.vehicles.models;

public class insurance {
	private long vehicleno;
	private String insuredcompany;
	private String Addressregistered;
	public long getVehicleno() {
		return vehicleno;
	}
	public void setVehicleno(long vehicleno) {
		this.vehicleno = vehicleno;
	}
	public String getInsuredcompany() {
		return insuredcompany;
	}
	public void setInsuredcompany(String insuredcompany) {
		this.insuredcompany = insuredcompany;
	}
	public String getAddressregistered() {
		return Addressregistered;
	}
	public void setAddressregistered(String addressregistered) {
		Addressregistered = addressregistered;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Addressregistered == null) ? 0 : Addressregistered.hashCode());
		result = prime * result + ((insuredcompany == null) ? 0 : insuredcompany.hashCode());
		result = prime * result + (int) (vehicleno ^ (vehicleno >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		insurance other = (insurance) obj;
		if (Addressregistered == null) {
			if (other.Addressregistered != null)
				return false;
		} else if (!Addressregistered.equals(other.Addressregistered))
			return false;
		if (insuredcompany == null) {
			if (other.insuredcompany != null)
				return false;
		} else if (!insuredcompany.equals(other.insuredcompany))
			return false;
		if (vehicleno != other.vehicleno)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "insurance [vehicleno=" + vehicleno + ", insuredcompany=" + insuredcompany + ", Addressregistered="
				+ Addressregistered + "]";
	}

	

}
