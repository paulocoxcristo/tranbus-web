package cu.edu.cujae.pweb.bean;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
public class DistrictBean {
	private int idDistrict; // pk
	private String district;
	
	public DistrictBean(){
		
	}
	
	public void setIdDistrict(int idDistrict) {
		this.idDistrict = idDistrict;
	}
	
	public void setdistrict(String district) {
		this.district = district;
	}
	
	public int getIdDistrict() {
		return this.idDistrict;
	}
	
	public String getDistrict() {
		return this.district;
	}

	protected HttpServletRequest getRequest() {
	    return (HttpServletRequest) getFacesContext().getExternalContext().getRequest();
	}
	
	protected FacesContext getFacesContext() {
	    return FacesContext.getCurrentInstance();
	}
}
