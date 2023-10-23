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

import cu.edu.cujae.pweb.dto.ContractDTO;
import cu.edu.cujae.pweb.dto.CountryDTO;
import cu.edu.cujae.pweb.service.ContractService;
import cu.edu.cujae.pweb.service.CountryService;
import cu.edu.cujae.pweb.utils.JsfUtils;

@Component //Le indica a spring es un componete registrado
@ManagedBean
@ViewScoped //Este es el alcance utilizado para trabajar con Ajax
public class ManageContractBean {
	
	private ContractDTO contractDTO;
	private ContractDTO selectedContract;
	private List<ContractDTO> contracts;
	private CountryDTO selectedCountry;
	private List<ContractDTO>selectedContracts;
	private List<CountryDTO> countries;
	private List<CountryDTO> selectedCountries;
	@Autowired
	private ContractService contractService;
	
	@Autowired
	private CountryService countryService;
	
	public ManageContractBean() {
		
	}
	
	public List<ContractDTO> getSelectedContracts() {
		return selectedContracts;
	}

	@PostConstruct
	public void init() {
		contracts = contracts == null ? contractService.getContracts() : contracts;
		countries = countryService.getCountries();
	}
	
	public void openNew() {
		this.selectedContract = new ContractDTO();
		this.selectedCountry = null;
	}
	
	public void openForEdit() {
		CountryDTO country = this.selectedContract.getCountry();
		this.selectedCountry = country;
	}
	
	public void saveContract() {
		if(this.selectedContract.getIdContract() == null) {
			this.selectedContract.setIdContract(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9));
			this.selectedContract.setNewRecord(true);
			List<CountryDTO> countryToAdd = new ArrayList<CountryDTO>();
			countryToAdd.add(selectedCountry);
			this.contracts.add(this.selectedContract);
			JsfUtils.addMessageFromBundle(null, FacesMessage.SEVERITY_INFO, "message_contract_added");
		}
		else {
			JsfUtils.addMessageFromBundle(null, FacesMessage.SEVERITY_INFO, "message_contract_edited");
		}

		PrimeFaces.current().executeScript("PF('manageContractDialog').hide()");//Este code permite cerrar el dialog cuyo id es manageContractDialog. Este identificador es el widgetVar
		PrimeFaces.current().ajax().update("form:dt-contract");// Este code es para refrescar el componente con id dt-users que se encuentra dentro del formulario con id form
	}
	
	public void deleteContract() {
		try {
			this.contracts.remove(this.selectedCountry);
			this.selectedCountry = null;
			JsfUtils.addMessageFromBundle(null, FacesMessage.SEVERITY_INFO, "message_contract_removed");
			PrimeFaces.current().ajax().update("form:dt-contract");// Este code es para refrescar el componente con id dt-users que se encuentra dentro del formulario con id form
		}catch (Exception e) {
			JsfUtils.addMessageFromBundle(null, FacesMessage.SEVERITY_ERROR, "message_error");
		}
	}

	public ContractDTO getContractDTO() {
		return contractDTO;
	}

	public void setContractDTO(ContractDTO contractDTO) {
		this.contractDTO = contractDTO;
	}

	public ContractDTO getSelectedContract() {
		return selectedContract;
	}

	public void setSelectedContract(ContractDTO selectedContract) {
		this.selectedContract = selectedContract;
	}

	public List<ContractDTO> getContracts() {
		return contracts;
	}

	public void setContracts(List<ContractDTO> contracts) {
		this.contracts = contracts;
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

	public ContractService getContractService() {
		return contractService;
	}

	public void setContractService(ContractService contractService) {
		this.contractService = contractService;
	}

	public CountryService getCountryService() {
		return countryService;
	}

	public void setCountryService(CountryService countryService) {
		this.countryService = countryService;
	}
	
	
	
}
