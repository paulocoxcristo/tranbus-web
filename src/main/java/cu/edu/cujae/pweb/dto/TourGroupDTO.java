package cu.edu.cujae.pweb.dto;

public class TourGroupDTO {
	private String idGroup;
	private int pax;
	private CountryDTO country;
	private boolean newRecord;
	
	public TourGroupDTO() {
		idGroup=null;
	}
	
	public TourGroupDTO(String idGroup, int pax, CountryDTO country, boolean newRecord) {
		setIdGroup(idGroup);
		setPax(pax);
		setCountry(country);
		setNewRecord(newRecord);
	}
	
	public void setIdGroup(String idGroup) {
		this.idGroup = idGroup;
	}
	
	public void setPax(int pax) {
		this.pax = pax;
	}
	
	public void setCountry(CountryDTO country) {
		this.country = country;
	}
	
	public String getIdGroup() {
		return this.idGroup;
	}
	
	public int getPax() {
		return this.pax;
	}
	
	public CountryDTO getCountry() {
		return this.country;
	}
	
	public boolean isNewRecord() {
		return newRecord;
	}
	
	public void setNewRecord(boolean newRecord) {
		this.newRecord = newRecord;
	}

}
