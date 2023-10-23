package cu.edu.cujae.pweb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cu.edu.cujae.pweb.dto.BrandDTO;


@Service
public class BrandServiceImpl implements BrandService{

	@Override
	public List<BrandDTO> getBrands() {
		List<BrandDTO> brands = new ArrayList<>();
		brands.add(new BrandDTO("Mercedes-Benz", 15, "Diesel", 12));
		brands.add(new BrandDTO("Hyundai", 10, "Gasolina Especial", 10));
		brands.add(new BrandDTO("Toyota", 12, "Diesel", 8));
		brands.add(new BrandDTO("Yutong", 45, "Diesel", 5));
		brands.add(new BrandDTO("Kia", 5, "Gasolina Especial", 18));
		brands.add(new BrandDTO("Audi", 6, "Gasolina Especial", 20));
		
		return brands;
	}

	@Override
	public BrandDTO getBrandById(String brandId) {
		return getBrands().stream().filter(r -> r.getIdBrand().equals(brandId)).findFirst().get();
	}

	@Override
	public void createBrand(BrandDTO brand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBrand(BrandDTO brand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBrand(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> getFuels() {
		List<String>fuels= new ArrayList<>();
		fuels.add("Diesel");
		fuels.add("Especial");
		return fuels;
	}
	
}
