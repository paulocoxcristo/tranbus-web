package cu.edu.cujae.pweb.dto;

public class DriverDTO {
	private String dni;
	private String nameDvr;
	private String addressDvr;
	private String phoneDvr;
	private DistrictDTO district;
	private String typeDvr;
	private boolean newRecord;
	
	public DriverDTO() {
		
	}
	
	public DriverDTO(String dni){
		setDni(dni);
		this.addressDvr = null;
		this.nameDvr = null;
		this.addressDvr = null;
		this.phoneDvr = null;
		this.district = null;
		this.typeDvr = null;	
	}
	public DriverDTO(String dni, String nameDvr, String addressDvr, String phoneDvr, DistrictDTO district, String typeDvr, boolean newRecord) {
		setDni(dni);
		setNameDvr(nameDvr);
		setAddressDvr(addressDvr);
		setPhoneDvr(phoneDvr);
		setDistrict(district);
		setTypeDvr(typeDvr);
		setNewRecord(newRecord);
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public void setNameDvr(String nameDvr) {
		this.nameDvr = nameDvr;
	}
	
	public void setAddressDvr(String addressDvr) {
		this.addressDvr = addressDvr;
	}
	
	public void setPhoneDvr(String phoneDvr) {
		this.phoneDvr = phoneDvr;
	}
	
	public void setDistrict(DistrictDTO district) {
		this.district = district;
	}
	
	public void setTypeDvr(String typeDvr) {
		this.typeDvr = typeDvr;
	}
	
	public String getDni() {
		return this.dni;
	}
	
	public String getNameDvr() {
		return this.nameDvr;
	}
	
	public String getAddressDvr() {
		return this.addressDvr;
	}
	
	public String getPhoneDvr() {
		return this.phoneDvr;
	}
	
	public DistrictDTO getDistrict() {
		return this.district;
	}
	
	public String getTypeDvr() {
		return this.typeDvr;
	}
	
	public boolean isNewRecord() {
		return newRecord;
	}
	
	public void setNewRecord(boolean newRecord) {
		this.newRecord = newRecord;
	}
}
