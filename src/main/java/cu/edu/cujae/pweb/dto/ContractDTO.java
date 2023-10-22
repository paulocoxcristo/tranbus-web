package cu.edu.cujae.pweb.dto;

import java.sql.Date;

public class ContractDTO {
	private int idContract;
	private String applicantName;
	private Date startDate;
	private Date endingDate;
	private int idCountry;

	public ContractDTO(int idContract, String applicantName, Date startDate, Date endingDate, int idCountry) {
		setIdContract(idContract);
		setApplicantName(applicantName);
		setStartDate(startDate);
		setEndingDate(endingDate);
		setIdCountry(idCountry);
	}
	
	public ContractDTO(String applicantName, Date startDate, Date endingDate, int idCountry) {
		idContract = -1;
		setApplicantName(applicantName);
		setStartDate(startDate);
		setEndingDate(endingDate);
		setIdCountry(idCountry);
	}
	
	public void setIdContract(int idContract) {
		this.idContract = idContract;
	}
	
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public void setEndingDate(Date endingDate) {
		this.endingDate = endingDate;
	}
	
	public void setIdCountry(int idCountry) {
		this.idCountry = idCountry;
	}
	
	public int getIdContract() {
		return this.idContract;
	}

	public String getApplicantName() {
		return this.applicantName;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public Date getEndingDate() {
		return this.endingDate;
	}

	public int getIdCountry() {
		return this.idCountry;
	}

}
