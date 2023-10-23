package cu.edu.cujae.pweb.service;
import java.util.List;

import cu.edu.cujae.pweb.dto.DistrictDTO;

public interface DistrictService {
	List<DistrictDTO> getDistrict();
	DistrictDTO getDistrictById(String idDistrict);
	void createDistrict(DistrictDTO district);
	void updateDistrict(DistrictDTO district);
	void deleteDistrict(String idDistrict);
}
