package cu.edu.cujae.pweb.dto;

public class CarDTO {
	private String carPlate;
	private String carNumber;
	private int fleetNumber;
	private int idBrand;
	
	public CarDTO(String carPlate) {
		setCarPlate(carPlate);
		this.carNumber = null;
		this.fleetNumber = -1;
		this.idBrand = -1;
	}
	
	public CarDTO(String carPlate,String carNumber, int fleetNumber, int idBrand ) {
		setCarPlate(carPlate);
		setCarNumber(carNumber);
		setFleetNumber(fleetNumber);
		setIdBramd(idBrand);
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
	
	public void setIdBramd(int idBrand) {
		this.idBrand = idBrand;
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
	
	public int getIdBrand() {
		return this.idBrand;
	}
}
