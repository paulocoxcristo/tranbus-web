package cu.edu.cujae.pweb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cu.edu.cujae.pweb.dto.DistrictDTO;

@Service
public class DistrictServiceImpl implements DistrictService{

	@Override
	public List<DistrictDTO> getDistrict() {
		
		List<DistrictDTO> districts = new ArrayList<>();
		districts.add(new DistrictDTO("1", "Habana Vieja"));
		districts.add(new DistrictDTO("2", "Centro Habana"));
		districts.add(new DistrictDTO("3", "Diez de Octubre"));
		districts.add(new DistrictDTO("4", "Plaza"));
		districts.add(new DistrictDTO("5", "Habana del Este"));
		
		return districts;
	}

	@Override
	public DistrictDTO getDistrictById(String idDistrict) {
		return getDistrict().stream().filter(r -> r.getIdDistrict().equals(idDistrict)).findFirst().get();
	}

	@Override
	public void createDistrict(DistrictDTO district) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDistrict(DistrictDTO district) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDistrict(String idDistrict) {
		// TODO Auto-generated method stub
		
	}

}
