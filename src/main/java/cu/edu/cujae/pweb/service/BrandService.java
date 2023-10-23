package cu.edu.cujae.pweb.service;

import java.util.List;

import cu.edu.cujae.pweb.dto.BrandDTO;


public interface BrandService {

	List<BrandDTO> getBrands();	
	List<String> getFuels();
	BrandDTO getBrandById(String brandId);
	void createBrand(BrandDTO brand);
	void updateBrand(BrandDTO brand);
	void deleteBrand(String idBrand);

}

