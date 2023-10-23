package cu.edu.cujae.pweb.dto;

public class BrandDTO {
	private String idBrand;
	private String brand;
	private int numbSeats;
	private String fuelType;
	private int literKm;

	public BrandDTO(String idBrand) {
		setIdBrand(idBrand);
		this.brand = null;
		this.numbSeats = -1;
		this.fuelType = null;
		this.literKm = -1;
	}
	
	public BrandDTO(String brand, int numbSeats, String fuelType, int literKm) {
		this.idBrand = null;
		setBrand(brand);
		setNumbSeats(numbSeats);
		setFuelType(fuelType);
		setLiterKm(literKm);
	}
	
	public BrandDTO(String idBrand, String brand, int numbSeats, String fuelType, int literKm) {
		setIdBrand(idBrand);
		setBrand(brand);
		setNumbSeats(numbSeats);
		setFuelType(fuelType);
		setLiterKm(literKm);
	}

	public BrandDTO() {
		super();
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

	public void setIdBrand(String idBrand) {
		this.idBrand = idBrand;
	}

	public String getIdBrand() {
		return this.idBrand;
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
