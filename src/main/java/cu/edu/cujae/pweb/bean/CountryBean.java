package cu.edu.cujae.pweb.bean;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
public class CountryBean {
	private int idCountry; // pk
	private String country;
	
	public CountryBean() {

	}
	
	public void setIdCountry(int idCountry) {
		this.idCountry = idCountry;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public int getIdCountry() {
		return this.idCountry;
	}
	
	public String getCountry() {
		return this.country;
	}
		
	protected HttpServletRequest getRequest() {
	    return (HttpServletRequest) getFacesContext().getExternalContext().getRequest();
	}
	
	protected FacesContext getFacesContext() {
	    return FacesContext.getCurrentInstance();
	}
}
