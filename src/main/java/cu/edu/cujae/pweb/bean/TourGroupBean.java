package cu.edu.cujae.pweb.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
public class TourGroupBean {
	private int idGroup; // pk
	private int pax;
	private String country; // join country
	
	public TourGroupBean() {

	}
	
	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}
	
	public void setPax(int pax) {
		this.pax = pax;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public int getIdGroup() {
		return this.idGroup;
	}
	
	public int getPax() {
		return this.pax;
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
