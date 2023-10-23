package cu.edu.cujae.pweb.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import cu.edu.cujae.pweb.dto.DistrictDTO;

@ManagedBean
public class DriverBean {
	private int idDvr;	// pk en base de datos, pero aqui esta solo por si acaso xD
	private String dni; // usar el dni
	private String nameDvr;
	private String addressDvr;
	private String phoneDvr;
	private DistrictDTO district; // join district
	private String typeDvr;

	public DriverBean() {
	}

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

	public DistrictDTO getDistrict() {
		return district;
	}

	public void setDistrict(DistrictDTO district) {
		this.district = district;
	}

	public String getTypeDvr() {
		return typeDvr;
	}

	public void setTypeDvr(String typeDvr) {
		this.typeDvr = typeDvr;
	}

	protected HttpServletRequest getRequest() {
		return (HttpServletRequest) getFacesContext().getExternalContext().getRequest();
	}

	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}

}
