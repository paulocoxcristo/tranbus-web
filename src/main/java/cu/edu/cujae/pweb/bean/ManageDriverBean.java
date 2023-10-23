package cu.edu.cujae.pweb.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import org.primefaces.PrimeFaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cu.edu.cujae.pweb.dto.CountryDTO;
import cu.edu.cujae.pweb.dto.DistrictDTO;
import cu.edu.cujae.pweb.dto.DriverDTO;
import cu.edu.cujae.pweb.dto.TourGroupDTO;
import cu.edu.cujae.pweb.service.DistrictService;
import cu.edu.cujae.pweb.service.DriverService;
import cu.edu.cujae.pweb.utils.JsfUtils;

@Component //Le indica a spring es un componete registrado
@ManagedBean
@ViewScoped //Este es el alcance utilizado para trabajar con Ajax
public class ManageDriverBean {
	private DriverDTO driverDTO;
	private DriverDTO selectedDriver;
	private List<DriverDTO> drivers;
	private DistrictDTO selectedDistrict;
	
	private List<DistrictDTO> districtes;
	
	@Autowired
	private DriverService driverService;
	
	@Autowired
	private DistrictService districtService;
	
	public ManageDriverBean() {
		
	}
	
	@PostConstruct
	public void init() {
		drivers = drivers == null? driverService.getDriver() : drivers;
		districtes = districtService.getDistrict();
	}
	
	public void openNew() {
        this.selectedDriver = new DriverDTO();
        this.selectedDistrict = null;
    }
	
	public void openForEdit() {
		DistrictDTO district = this.selectedDriver.getDistrict();
		this.selectedDistrict = district;
	}
	
	public void saveDriver() {
		if(this.selectedDriver.getDni() == null) {
			this.selectedDriver.setDni(UUID.randomUUID().toString().replaceAll("-----------", "").substring(0, 9));
			this.selectedDriver.setNewRecord(true);
			List<DistrictDTO> districtToAdd = new ArrayList<DistrictDTO>();
			districtToAdd.add(selectedDistrict);
			this.drivers.add(this.selectedDriver);
			JsfUtils.addMessageFromBundle(null, FacesMessage.SEVERITY_INFO, "message_driver_added");
		}
		else {
			JsfUtils.addMessageFromBundle(null, FacesMessage.SEVERITY_INFO, "message_driver_edited");
		}

		PrimeFaces.current().executeScript("PF('manageDriverDialog').hide()");//Este code permite cerrar el dialog cuyo id es manageUserDialog. Este identificador es el widgetVar
		PrimeFaces.current().ajax().update("form:dt-driver");// Este code es para refrescar el componente con id dt-users que se encuentra dentro del formulario con id form
	}
	
	
	public void deleteTeamGroup() {
		try {
			this.drivers.remove(this.selectedDriver);
			this.selectedDistrict = null;
			JsfUtils.addMessageFromBundle(null, FacesMessage.SEVERITY_INFO, "message_driver_removed");
			PrimeFaces.current().ajax().update("form:dt-driver");// Este code es para refrescar el componente con id dt-users que se encuentra dentro del formulario con id form
		}catch (Exception e) {
			JsfUtils.addMessageFromBundle(null, FacesMessage.SEVERITY_ERROR, "message_error");
		}
	}
	
	
	public DriverDTO getTourGroupDTO() {
		return driverDTO;
	}

	public void setTourGroupDTO(DriverDTO driverDTO) {
		this.driverDTO = driverDTO;
	}

	public DriverDTO getSelectedUser() {
		return selectedDriver;
	}

	public void setSelectedSelectedTourGroup(DriverDTO selectedDriver) {
		this.selectedDriver = selectedDriver;
	}

	public List<DriverDTO> getTourGroups() {
		return drivers;
	}

	public void setTourGroups(List<DriverDTO> drivers) {
		this.drivers = drivers;
	}

	public DistrictDTO getSelectedCountry() {
		return selectedDistrict;
	}

	public void setSelectedCountry(DistrictDTO selectedDistrict) {
		this.selectedDistrict = selectedDistrict;
	}

	public List<DistrictDTO> getCountries() {
		return districtes;
	}

	public void setCountries(List<DistrictDTO> districtes) {
		this.districtes = districtes;
	}
	
}
