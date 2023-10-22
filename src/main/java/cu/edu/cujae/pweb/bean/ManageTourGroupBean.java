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
import cu.edu.cujae.pweb.dto.TourGroupDTO;
import cu.edu.cujae.pweb.service.CountryService;
import cu.edu.cujae.pweb.service.TourGroupService;
import cu.edu.cujae.pweb.utils.JsfUtils;

@Component //Le indica a spring es un componete registrado
@ManagedBean
@ViewScoped //Este es el alcance utilizado para trabajar con Ajax
public class ManageTourGroupBean {

	private TourGroupDTO tourGroupDTO;
	private TourGroupDTO selectedTourGroup;
	private List<TourGroupDTO> tourGroups;
	private CountryDTO selectedCountry;

	private List<CountryDTO> countries;

	@Autowired
	private TourGroupService tourGroupService;

	@Autowired
	private CountryService countryService;

	public ManageTourGroupBean() {

	}

	@PostConstruct
	public void init() {
		tourGroups = tourGroups == null? tourGroupService.getTourGroup() : tourGroups;
		countries = countryService.getCountries();
	}


	public void openNew() {
		this.selectedTourGroup = new TourGroupDTO();
		this.selectedCountry = null;
	}

	public void openForEdit() {
		CountryDTO country = this.selectedTourGroup.getCountry();
		this.selectedCountry = country;
	}

	public void saveTourGroup() {
		if(this.selectedTourGroup.getIdGroup() == null) {
			this.selectedTourGroup.setIdGroup(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9));
			this.selectedTourGroup.setNewRecord(true);
			List<CountryDTO> countryToAdd = new ArrayList<CountryDTO>();
			countryToAdd.add(selectedCountry);
			this.tourGroups.add(this.selectedTourGroup);
			JsfUtils.addMessageFromBundle(null, FacesMessage.SEVERITY_INFO, "message_tourGroup_added");
		}
		else {
			JsfUtils.addMessageFromBundle(null, FacesMessage.SEVERITY_INFO, "message_tourGroup_edited");
		}

		PrimeFaces.current().executeScript("PF('manageTourGroupDialog').hide()");//Este code permite cerrar el dialog cuyo id es manageUserDialog. Este identificador es el widgetVar
		PrimeFaces.current().ajax().update("form:dt-tourGroup");// Este code es para refrescar el componente con id dt-users que se encuentra dentro del formulario con id form

	}

	public void deleteTeamGroup() {
		try {
			this.tourGroups.remove(this.selectedCountry);
			this.selectedCountry = null;
			JsfUtils.addMessageFromBundle(null, FacesMessage.SEVERITY_INFO, "message_tourGroup_removed");
			PrimeFaces.current().ajax().update("form:dt-tourGroup");// Este code es para refrescar el componente con id dt-users que se encuentra dentro del formulario con id form
		}catch (Exception e) {
			JsfUtils.addMessageFromBundle(null, FacesMessage.SEVERITY_ERROR, "message_error");
		}
	}


	public TourGroupDTO getTourGroupDTO() {
		return tourGroupDTO;
	}

	public void setTourGroupDTO(TourGroupDTO tourGroupDTO) {
		this.tourGroupDTO = tourGroupDTO;
	}

	public TourGroupDTO getSelectedUser() {
		return selectedTourGroup;
	}

	public void setSelectedSelectedTourGroup(TourGroupDTO selectedTourGroup) {
		this.selectedTourGroup = selectedTourGroup;
	}

	public List<TourGroupDTO> getTourGroups() {
		return tourGroups;
	}

	public void setTourGroups(List<TourGroupDTO> tourGroups) {
		this.tourGroups = tourGroups;
	}

	public CountryDTO getSelectedCountry() {
		return selectedCountry;
	}

	public void setSelectedCountry(CountryDTO selectedCountry) {
		this.selectedCountry = selectedCountry;
	}

	public List<CountryDTO> getCountries() {
		return countries;
	}

	public void setCountries(List<CountryDTO> countries) {
		this.countries = countries;
	}

}
