package cu.edu.cujae.pweb.bean;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import java.sql.Timestamp;

@ManagedBean
public class PlannedServBean {
	private int serial; // pk
	private Timestamp pickupTime;
	private String servName;
	private int groupPax; // JOIN tour_group
	private String groupCountry; // JOIN country
	private String carPlate;
	private int reqNumber;
	private String pickupLocation;
	private int kmDriven;
	private double spentFuel;
	private double payment;

	public PlannedServBean() {

	}

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public Timestamp getPickupTime() {
		return pickupTime;
	}

	public void setPickupTime(Timestamp pickupTime) {
		this.pickupTime = pickupTime;
	}

	public String getServName() {
		return servName;
	}

	public void setServName(String servName) {
		this.servName = servName;
	}

	public int getGroupPax() {
		return groupPax;
	}

	public void setGroupPax(int groupPax) {
		this.groupPax = groupPax;
	}

	public String getGroupCountry() {
		return groupCountry;
	}

	public void setGroupCountry(String groupCountry) {
		this.groupCountry = groupCountry;
	}

	public String getCarPlate() {
		return carPlate;
	}

	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}

	public int getReqNumber() {
		return reqNumber;
	}

	public void setReqNumber(int reqNumber) {
		this.reqNumber = reqNumber;
	}

	public String getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public int getKmDriven() {
		return kmDriven;
	}

	public void setKmDriven(int kmDriven) {
		this.kmDriven = kmDriven;
	}

	public double getSpentFuel() {
		return spentFuel;
	}

	public void setSpentFuel(double spentFuel) {
		this.spentFuel = spentFuel;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	protected HttpServletRequest getRequest() {
		return (HttpServletRequest) getFacesContext().getExternalContext().getRequest();
	}

	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
}
