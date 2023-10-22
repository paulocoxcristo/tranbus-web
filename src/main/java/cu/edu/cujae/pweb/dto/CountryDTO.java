package cu.edu.cujae.pweb.dto;

public class CountryDTO {
	private String idCountry;
	private String country;
	
	public CountryDTO(String idCountry, String country) {
		setIdCountry(idCountry);
		setCountry(country);
	}
	
	public void setIdCountry(String idCountry) {
		this.idCountry = idCountry;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getIdCountry() {
		return this.idCountry;
	}
	
	public String getCountry() {
		return this.country;
	}

}
