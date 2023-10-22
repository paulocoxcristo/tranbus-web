package cu.edu.cujae.pweb.dto;

public abstract class DriverDTO {
	private String dni;
	private String nameDvr;
	private String addressDvr;
	private String phoneDvr;
	private int idDistrict;
	private String typeDvr;
	
	public DriverDTO(String dni){
		setDni(dni);
		this.addressDvr = null;
		this.nameDvr = null;
		this.addressDvr = null;
		this.phoneDvr = null;
		this.idDistrict = -1;
		this.typeDvr = null;	
	}
	public DriverDTO(String dni, String nameDvr, String addressDvr, String phoneDvr, int idDistrict, String typeDvr) {
		setDni(dni);
		setNameDvr(nameDvr);
		setAddressDvr(addressDvr);
		setPhoneDvr(phoneDvr);
		setIdDistrict(idDistrict);
		setTypeDvr(typeDvr);
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
	
	public void setIdDistrict(int idDistrict) {
		this.idDistrict = idDistrict;
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
	
	public int getIdDistrict() {
		return this.idDistrict;
	}
	
	public String getTypeDvr() {
		return this.typeDvr;
	}
}
