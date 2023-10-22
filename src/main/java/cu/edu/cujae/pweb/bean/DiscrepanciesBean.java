package cu.edu.cujae.pweb.bean;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import java.sql.Date;

@ManagedBean
public class DiscrepanciesBean {
	private Date month;		// pk
	private String carPlate;// pk
	private int plannedKm;
	private int drivenKm;
	private int kmDifference;
	private double plannedFuel;
	private double spentFuel;
	private double fuelDifference;
	
	public DiscrepanciesBean() {

	}

	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}
	
	public void setMonth(Date month) {
		this.month = month;
	}
	
	public void setPlannedKm(int plannedKm) {
		this.plannedKm = plannedKm;
	}

	public void setDrivenKm(int drivenKm) {
		this.drivenKm = drivenKm;
	}

	public void setKmDifference(int kmDifference) {
		this.kmDifference = kmDifference;
	}
	
	public void setPlannedFuel(double plannedFuel) {
		this.plannedFuel = plannedFuel;
	}
	
	public void setSpentFuel(double spentFuel) {
		this.spentFuel = spentFuel;
	}

	public void setFuelDifference(double fuelDifference) {
		this.fuelDifference = fuelDifference;
	}


	public Date getMonth() {
		return this.month;
	}
	
	public String getCarPlate() {
		return this.carPlate;
	}
	
	public int getPlannedKm() {
		return this.plannedKm;
	}

	public int getDrivenKm() {
		return drivenKm;
	}

	public int getKmDifference() {
		return kmDifference;
	}

	public double getPlannedFuel() {
		return this.plannedFuel;
	}

	public double getSpentFuel() {
		return spentFuel;
	}

	public double getFuelDifference() {
		return fuelDifference;
	}
		
	protected HttpServletRequest getRequest() {
	    return (HttpServletRequest) getFacesContext().getExternalContext().getRequest();
	}
	
	protected FacesContext getFacesContext() {
	    return FacesContext.getCurrentInstance();
	}

	
}
