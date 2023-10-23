package cu.edu.cujae.pweb.dto;

public class CarDTO {
	private String carPlate;
	private String carNumber;
	private int fleetNumber;
	private BrandDTO brand;
	
	public CarDTO(String carPlate) {
		setCarPlate(carPlate);
		this.carNumber = null;
		this.fleetNumber = -1;
		this.brand = null;
	}
	
	public CarDTO(String carPlate,String carNumber, int fleetNumber, BrandDTO brand ) {
		setCarPlate(carPlate);
		setCarNumber(carNumber);
		setFleetNumber(fleetNumber);
		setBrand(brand);
	}
	
	public CarDTO() {
		super();
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
	
	public void setBrand(BrandDTO brand) {
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
	
	public BrandDTO getBrand() {
		return this.brand;
	}
}
