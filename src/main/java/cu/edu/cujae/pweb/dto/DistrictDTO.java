package cu.edu.cujae.pweb.dto;

public class DistrictDTO {
	private int idDistrict;
	private String district;
	
	public DistrictDTO(int idDistrict, String district) {
		setIdDistrict(idDistrict);
		setdistrict(district);
	}
	
	public void setIdDistrict(int idDistrict) {
		this.idDistrict = idDistrict;
	}
	
	public void setdistrict(String district) {
		this.district = district;
	}
	
	public int getIdDistrict() {
		return this.idDistrict;
	}
	
	public String getDistrict() {
		return this.district;
	}

}
