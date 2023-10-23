package cu.edu.cujae.pweb.dto;

import java.sql.Date;

public class ContractDTO {
	private String idContract;
	private String applicantName;
	private Date startDate;
	private Date endingDate;
	private CountryDTO country;
	private boolean newRecord;
	
	public ContractDTO() {
		
	}

	public ContractDTO(String idContract, String applicantName, Date startDate, Date endingDate, CountryDTO country, boolean newRecord) {
		setIdContract(idContract);
		setApplicantName(applicantName);
		setStartDate(startDate);
		setEndingDate(endingDate);
		setCountry(country);
		setNewRecord(newRecord);		
	}
	// sin id
	public ContractDTO(String applicantName, Date startDate, Date endingDate, int idCountry) {
		idContract = null;
		setApplicantName(applicantName);
		setStartDate(startDate);
		setEndingDate(endingDate);
		setCountry(country);
	}

	public String getIdContract() {
		return idContract;
	}

	public void setIdContract(String idContract) {
		this.idContract = idContract;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndingDate() {
		return endingDate;
	}

	public void setEndingDate(Date endingDate) {
		this.endingDate = endingDate;
	}

	public CountryDTO getCountry() {
		return country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}

	public boolean isNewRecord() {
		return newRecord;
	}

	public void setNewRecord(boolean newRecord) {
		this.newRecord = newRecord;
	}
	

}
