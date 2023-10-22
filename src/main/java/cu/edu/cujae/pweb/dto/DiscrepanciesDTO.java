package cu.edu.cujae.pweb.dto;

import java.sql.Date;

public class DiscrepanciesDTO {
	private Date month;
	private String carPlate;
	private int plannedKm;
	private int drivenKm;
	private int kmDifference;
	private double plannedFuel;
	private int spentFuel;
	private int fuelDifference;
	
	public DiscrepanciesDTO(Date month, String carPlate, int plannedKm, int drivenKm, int kmDifference, double plannedFuel, int spentFuel, int fuelDifference) {
		setMonth(month);
		setCarPlate(carPlate);
		setPlannedKm(plannedKm);
		setDrivenKm(drivenKm);
		setKmDifference(kmDifference);
		setPlannedFuel(plannedFuel);
		setSpentFuel(spentFuel);
		setFuelDifference(fuelDifference);
	}
	
	public void setFuelDifference(int fuelDifference) {
		this.fuelDifference = fuelDifference;
	}
	
	public void setSpentFuel(int spentFuel) {
		this.spentFuel = spentFuel;
	}
	
	public void setPlannedFuel(double plannedFuel) {
		this.plannedFuel = plannedFuel;
	}
	
	public void setKmDifference(int kmDifference) {
		this.kmDifference = kmDifference;
	}
	
	public void setDrivenKm(int drivenKm) {
		this.drivenKm = drivenKm;
	}
	
	public void setPlannedKm(int plannedKm) {
		this.plannedKm = plannedKm;
	}
	
	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}
	
	public void setMonth(Date month) {
		this.month = month;
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
		return this.drivenKm;
	}
	
	public int getKmDifference() {
		return this.kmDifference;
	}
	
	public double getPlannedFuel() {
		return this.plannedFuel;
	}
	
	public int getSpentFuel() {
		return this.spentFuel;
	}
	
	public int getFuelDifference() {
		return this.fuelDifference;
	}
}
