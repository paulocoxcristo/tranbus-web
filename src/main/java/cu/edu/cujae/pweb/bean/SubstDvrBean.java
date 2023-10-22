package cu.edu.cujae.pweb.bean;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
public class SubstDvrBean {
	private int idDvr; // pk
	private String dni;
	private String nameDvr;
	private String addressDvr;
	private String phoneDvr;
	private String district; // join district
	private String brand; // join brand

	public int getIdDvr() {
		return idDvr;
	}

	public void setIdDvr(int idDvr) {
		this.idDvr = idDvr;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNameDvr() {
		return nameDvr;
	}

	public void setNameDvr(String nameDvr) {
		this.nameDvr = nameDvr;
	}

	public String getAddressDvr() {
		return addressDvr;
	}

	public void setAddressDvr(String addressDvr) {
		this.addressDvr = addressDvr;
	}

	public String getPhoneDvr() {
		return phoneDvr;
	}

	public void setPhoneDvr(String phoneDvr) {
		this.phoneDvr = phoneDvr;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	protected HttpServletRequest getRequest() {
		return (HttpServletRequest) getFacesContext().getExternalContext().getRequest();
	}

	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
}
