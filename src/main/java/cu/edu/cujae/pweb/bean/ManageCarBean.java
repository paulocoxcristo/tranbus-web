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
import cu.edu.cujae.pweb.dto.CarDTO;
import cu.edu.cujae.pweb.dto.CountryDTO;
import cu.edu.cujae.pweb.dto.TourGroupDTO;
import cu.edu.cujae.pweb.service.BrandService;
import cu.edu.cujae.pweb.service.CarService;
import cu.edu.cujae.pweb.service.CountryService;
import cu.edu.cujae.pweb.service.TourGroupService;
import cu.edu.cujae.pweb.utils.JsfUtils;
@Component //Le indica a spring es un componete registrado
@ManagedBean
@ViewScoped //Este es el alcance utilizado para trabajar con Ajax
public class ManageCarBean {

	private CarDTO carDTO;
	private CarDTO selectedCarDTO;
	private List<CarDTO> cars;
	private List<BrandDTO> selectedBrands;
	private List<BrandDTO> brands;
	private BrandDTO selectedBrand;
	public List<BrandDTO> getSelectedBrands() {
		return selectedBrands;
	}



	@Autowired
	private CarService carService;

	@Autowired
	private BrandService brandService;

	public void openNew() {
		this.selectedCarDTO = new CarDTO();
		this.selectedBrand = null;
	}
	
	public ManageCarBean() {
	}


	@PostConstruct
	public void init() {
		cars = cars == null? carService.getCars() : cars;
		brands=brandService.getBrands();
	}
	
	
	public CarDTO getCarDTO() {
		return carDTO;
	}



	public CarDTO getSelectedCarDTO() {
		return selectedCarDTO;
	}



	public List<CarDTO> getCars() {
		return cars;
	}



	public List<BrandDTO> getBrands() {
		return brands;
	}



	public CarService getCarService() {
		return carService;
	}



	public BrandService getBrandService() {
		return brandService;
	}



	
}
