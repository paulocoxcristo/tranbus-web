package cu.edu.cujae.pweb.dto;

import java.sql.Date;

public class PlannedServDTO {
	private int serial;
	private int idGroup;
	private String carPlate;
	private String servName;
	private int reqNumber;
	private String pickupLocation;
	private Date pickupTime;
	private int kmDriven;
	private double spentFuel;
	private double paymentMoney;
	
	public PlannedServDTO(int serial,int idGroup, String carPlate, String servName, int reqNumber, String pickupLocation, Date pickupTime, 
			int kmDriven, double spentFuel, double paymentMoney) {
		setSerial(serial);
		setIdGroup(idGroup);
		setCarPlate(carPlate);
		setServName(servName);
		setReqNumber(reqNumber);
		setPickupLocation(pickupLocation);
		setPickupTime(pickupTime);
		setKmDriven(kmDriven);
		setSpentFuel(spentFuel);
		setPaymentMoney(paymentMoney);
	}
	
	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}
	
	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}
	
	public void setServName(String servName) {
		this.servName = servName;
	}
	
	public void setReqNumber(int reqNumber) {
		this.reqNumber = reqNumber;
	}
	
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	
	public void setPickupTime(Date pickupTime) {
		this.pickupTime = pickupTime;
	}
	
	public void setKmDriven(int kmDriven) {
		this.kmDriven = kmDriven;
	}
	
	private void setSpentFuel(double spentFuel) {
		this.spentFuel = spentFuel;
	}
	
	public void setPaymentMoney(double paymentMoney) {
		this.paymentMoney = paymentMoney;
	}
	
	public int getIdGroup() {
		return this.idGroup;
	}
	
	public String getCarPlate() {
		return this.carPlate;
	}
	
	public String getServName() {
		return this.servName;
	}
	
	public int getReqNumber() {
		return this.reqNumber;
	}
	
	public String getPickupLocation() {
		return this.pickupLocation;
	}
	
	public Date getPickupTime() {
		return this.pickupTime;
	}
	
	public int getKmDriven() {
		return this.kmDriven;
	}
	
	public double getSpentFuel() {
		return this.spentFuel;
	}
	
	public double getPaymentMoney() {
		return this.paymentMoney;
	}

	public int getSerial() {
		return serial;
	}

	private void setSerial(int serial) {
		this.serial = serial;
	}
	
}
