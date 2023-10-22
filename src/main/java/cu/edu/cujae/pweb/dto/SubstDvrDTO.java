package cu.edu.cujae.pweb.dto;

public class SubstDvrDTO extends DriverDTO{
	private int idBrand;
	
	public SubstDvrDTO(String dni, String nameDvr, String addressDvr, String phoneDvr, int idDistrict, String typeDvr, int idBrand) {
		super(dni, nameDvr, addressDvr, phoneDvr, idDistrict, typeDvr);
		setIdBrand(idBrand);
	}

	public void setIdBrand(int idBrand) {
		this.idBrand = idBrand;
	}
	
	public int getIdBrand() {
		return this.idBrand;
	}
}
