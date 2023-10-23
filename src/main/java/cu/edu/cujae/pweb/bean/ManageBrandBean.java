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

import cu.edu.cujae.pweb.dto.BrandDTO;
import cu.edu.cujae.pweb.dto.CountryDTO;
import cu.edu.cujae.pweb.dto.TourGroupDTO;
import cu.edu.cujae.pweb.service.BrandService;
import cu.edu.cujae.pweb.service.CountryService;
import cu.edu.cujae.pweb.service.TourGroupService;
import cu.edu.cujae.pweb.utils.JsfUtils;

@Component //Le indica a spring es un componete registrado
@ManagedBean
@ViewScoped //Este es el alcance utilizado para trabajar con Ajax
public class ManageBrandBean {
	private BrandDTO brandDTO;
	private BrandDTO selectedBrand;
	private List<BrandDTO> brands;
	private List<String> fuels;
	

	@Autowired
	private BrandService brandService;


	

	public ManageBrandBean() {

	}

	@PostConstruct
	public void init() {
		brands = brands == null? brandService.getBrands() : brands;
		fuels= brandService.getFuels();
	}


	public void openNew() {
		this.selectedBrand=new BrandDTO();
	}

	public void openForEdit() {
		
	}

	

	public void saveTourGroup() {
		if(this.selectedBrand.getIdBrand() == null) {
			this.selectedBrand.setIdBrand(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9));
			this.brands.add(this.selectedBrand);
			JsfUtils.addMessageFromBundle(null, FacesMessage.SEVERITY_INFO, "message_tourGroup_added");
		}
		else {
			JsfUtils.addMessageFromBundle(null, FacesMessage.SEVERITY_INFO, "message_tourGroup_edited");
		}

		PrimeFaces.current().executeScript("PF('manageBrandDialog').hide()");//Este code permite cerrar el dialog cuyo id es manageUserDialog. Este identificador es el widgetVar
		PrimeFaces.current().ajax().update("form:dt-brand");// Este code es para refrescar el componente con id dt-users que se encuentra dentro del formulario con id form

	}

	public void deleteTeamGroup() {
		try {
			this.brands.remove(this.selectedBrand);
			JsfUtils.addMessageFromBundle(null, FacesMessage.SEVERITY_INFO, "message_tourGroup_removed");
			PrimeFaces.current().ajax().update("form:dt-brand");// Este code es para refrescar el componente con id dt-users que se encuentra dentro del formulario con id form
		}catch (Exception e) {
			JsfUtils.addMessageFromBundle(null, FacesMessage.SEVERITY_ERROR, "message_error");
		}
	}

	public BrandDTO getBrandDTO() {
		return brandDTO;
	}

	public void setBrandDTO(BrandDTO brandDTO) {
		this.brandDTO = brandDTO;
	}

	public BrandDTO getSelectedBrand() {
		return selectedBrand;
	}

	public void setSelectedBrand(BrandDTO selectedBrand) {
		this.selectedBrand = selectedBrand;
	}

	public List<BrandDTO> getBrands() {
		return brands;
	}

	public void setBrands(List<BrandDTO> brands) {
		this.brands = brands;
	}

	public BrandService getBrandService() {
		return brandService;
	}

	public void setBrandService(BrandService brandService) {
		this.brandService = brandService;
	}

	public List<String> getFuels() {
		return fuels;
	}


	


}
