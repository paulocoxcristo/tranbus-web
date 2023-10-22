package cu.edu.cujae.pweb.bean;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
public class BrandBean {
	private int idBrand;	// pk
	private String brand;
	private int numbSeats;
	private String fuelType;
	private int literKm;

	public BrandBean() {

	}

	public int getIdBrand() {
		return idBrand;
	}

	public void setIdBrand(int idBrand) {
		this.idBrand = idBrand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNumbSeats() {
		return numbSeats;
	}

	public void setNumbSeats(int numbSeats) {
		this.numbSeats = numbSeats;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getLiterKm() {
		return literKm;
	}

	public void setLiterKm(int literKm) {
		this.literKm = literKm;
	}
		
	protected HttpServletRequest getRequest() {
	    return (HttpServletRequest) getFacesContext().getExternalContext().getRequest();
	}
	
	protected FacesContext getFacesContext() {
	    return FacesContext.getCurrentInstance();
	}

}
