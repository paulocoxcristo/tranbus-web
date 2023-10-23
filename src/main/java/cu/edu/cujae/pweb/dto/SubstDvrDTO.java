package cu.edu.cujae.pweb.dto;

public class SubstDvrDTO extends DriverDTO{
	private BrandDTO brand;
	
	public SubstDvrDTO(String dni, String nameDvr, String addressDvr, String phoneDvr, DistrictDTO district, String typeDvr, boolean newRecord, int idBrand) {
		super(dni, nameDvr, addressDvr, phoneDvr, district, typeDvr, newRecord);
		setBrand(brand);
	}

	public void setBrand(BrandDTO brand) {
		this.brand = brand;
	}
	
	public BrandDTO getBrand() {
		return this.brand;
	}
}
