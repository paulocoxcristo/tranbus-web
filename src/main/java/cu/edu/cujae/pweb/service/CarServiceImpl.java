package cu.edu.cujae.pweb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cu.edu.cujae.pweb.dto.BrandDTO;
import cu.edu.cujae.pweb.dto.CarDTO;

@Service
public class CarServiceImpl implements CarService {

	@Override
	public List<CarDTO> getCars() {
		List<CarDTO> cars= new ArrayList<>();
		BrandDTO brand=new BrandDTO("Mercedes-Benz", 15, "Diesel", 12);
		BrandDTO brand1=new BrandDTO("Hyundai", 10, "Gasolina Especial", 10);
		BrandDTO brand2= new BrandDTO("Toyota", 12, "Diesel", 8);
		BrandDTO brand3= new BrandDTO("Yutong", 45, "Diesel", 5);
		cars.add(new CarDTO("ASD123", "123", 12, brand2));
		cars.add(new CarDTO("QWE456", "54", 33, brand));
		cars.add(new CarDTO("QWE456", "54", 8, brand3));
		cars.add(new CarDTO("RRE216", "114", 25, brand1));


		return cars;
	}
	

}
