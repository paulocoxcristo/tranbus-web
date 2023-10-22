package cu.edu.cujae.pweb.bean;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
public class DrivingTeamBean {
	private String driver1;
	private String driver2;
	private String carNumber;
	private String carPlate;
	
	public DrivingTeamBean(){

	}	
	
	public void setDriver1(String driver1) {
		this.driver1 = driver1;
	}

	public void setDriver2(String driver2) {
		this.driver2 = driver2;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}

	public String getDriver1() {
		return driver1;
	}

	public String getDriver2() {
		return driver2;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public String getCarPlate() {
		return carPlate;
	}

	protected HttpServletRequest getRequest() {
	    return (HttpServletRequest) getFacesContext().getExternalContext().getRequest();
	}
	
	protected FacesContext getFacesContext() {
	    return FacesContext.getCurrentInstance();
	}
}
