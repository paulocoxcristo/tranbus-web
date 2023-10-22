package cu.edu.cujae.pweb.bean;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
public class ExtraServBean {
	private String carPlate; // pk
	private int idContract;  // pk
	private String applicantName; // join contract
	private int kmDriven;
	
	public ExtraServBean(){

	}
	
	public String getCarPlate() {
		return carPlate;
	}

	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}

	public int getIdContract() {
		return idContract;
	}

	public void setIdContract(int idContract) {
		this.idContract = idContract;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public int getKmDriven() {
		return kmDriven;
	}

	public void setKmDriven(int kmDriven) {
		this.kmDriven = kmDriven;
	}

	protected HttpServletRequest getRequest() {
	    return (HttpServletRequest) getFacesContext().getExternalContext().getRequest();
	}
	
	protected FacesContext getFacesContext() {
	    return FacesContext.getCurrentInstance();
	}

}
