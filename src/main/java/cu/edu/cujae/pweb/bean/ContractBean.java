package cu.edu.cujae.pweb.bean;

import java.io.IOException;
import java.sql.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
public class ContractBean {
	private int idContract; // pk
	private String applicantName;
	private Date startDate;
	private Date endingDate;
	private String country;	// join
	
	public ContractBean(){

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
	
	public void setCountry(String country) {
		this.country = country;
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

	public String getCountry() {
		return this.country;
	}
		
	protected HttpServletRequest getRequest() {
	    return (HttpServletRequest) getFacesContext().getExternalContext().getRequest();
	}
	
	protected FacesContext getFacesContext() {
	    return FacesContext.getCurrentInstance();
	}

}
