package cu.edu.cujae.pweb.dto;

public class BrandDTO {
	private int id;
	private String brand;
	private int numbSeats;
	private String fuelType;
	private int literKm;

	public BrandDTO(int id) {
		setId(id);
		this.brand = null;
		this.numbSeats = -1;
		this.fuelType = null;
		this.literKm = -1;
	}
	
	public BrandDTO(String brand, int numbSeats, String fuelType, int literKm) {
		id = -1;
		setBrand(brand);
		setNumbSeats(numbSeats);
		setFuelType(fuelType);
		setLiterKm(literKm);
	}
	
	public BrandDTO(int id, String brand, int numbSeats, String fuelType, int literKm) {
		setId(id);
		setBrand(brand);
		setNumbSeats(numbSeats);
		setFuelType(fuelType);
		setLiterKm(literKm);
	}

	public void setLiterKm(int literKm) {
		this.literKm = literKm;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public void setNumbSeats(int numbSeats) {
		this.numbSeats = numbSeats;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public String getBrand() {
		return this.brand;
	}

	public int getNumbSeats() {
		return this.numbSeats;
	}

	public String getFuelType() {
		return this.fuelType;
	}

	public int getLiterKm() {
		return this.literKm;
	}

}
