package cu.edu.cujae.pweb.bean;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
public class CarBean {
	private String carPlate; // pk
	private String carNumber;
	private int fleetNumber;
	private String brand; // join
	
	public CarBean(){

	}

	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}
	
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	
	public void setFleetNumber(int fleetNumber) {
		this.fleetNumber = fleetNumber;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getCarPlate() {
		return this.carPlate;
	}
	
	public String getCarNumber() {
		return this.carNumber;
	}
	
	public int getFleetNumber() {
		return this.fleetNumber;
	}
	
	public String getBrand() {
		return this.brand;
	}
		
	protected HttpServletRequest getRequest() {
	    return (HttpServletRequest) getFacesContext().getExternalContext().getRequest();
	}
	
	protected FacesContext getFacesContext() {
	    return FacesContext.getCurrentInstance();
	}
}
