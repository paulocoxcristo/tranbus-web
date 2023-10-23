package cu.edu.cujae.pweb.dto;

public class DistrictDTO {
	private String idDistrict;
	private String district;
	
	public DistrictDTO(String idDistrict, String district) {
		setIdDistrict(idDistrict);
		setdistrict(district);
	}
	
	public void setIdDistrict(String idDistrict) {
		this.idDistrict = idDistrict;
	}
	
	public void setdistrict(String district) {
		this.district = district;
	}
	
	public String getIdDistrict() {
		return this.idDistrict;
	}
	
	public String getDistrict() {
		return this.district;
	}

}
