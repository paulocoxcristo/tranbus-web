package cu.edu.cujae.pweb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cu.edu.cujae.pweb.dto.DriverDTO;

@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	private DistrictService districtService;

	@Override
	public List<DriverDTO> getDriver() {

		List<DriverDTO> drivers = new ArrayList<>();
		drivers.add(new DriverDTO("01032267467", "Pablo Daniel Morales García", "Bernaza 222 entre muralla y teniente rey", "55379731", districtService.getDistrictById("1"), "regular", false));
		drivers.add(new DriverDTO("01032267464", "Carlos Daniel Morales García", "Bernaza 222 entre muralla y teniente rey", "55379731", districtService.getDistrictById("2"), "regular", false));
		drivers.add(new DriverDTO("01032267465", "Pablo Pedro Morales García", "Bernaza 222 entre muralla y teniente rey", "55379731", districtService.getDistrictById("3"), "sustitute", false));
		drivers.add(new DriverDTO("01032267468", "Pablo Daniel Blanco García", "Bernaza 222 entre muralla y teniente rey", "55379731", districtService.getDistrictById("4"), "sustitute", false));
		drivers.add(new DriverDTO("01032267469", "Ernesto pupo cerrano", "Bernaza 222 entre muralla y teniente rey", "55379731", districtService.getDistrictById("5"), "regular", false));
		drivers.add(new DriverDTO("01032267461", "Tony Morales García", "Bernaza 222 entre muralla y teniente rey", "55379731", districtService.getDistrictById("2"), "sustitute", false));

		return drivers;
	}

	@Override
	public DriverDTO getDriverByDni(String idDriver) {
		return getDriver().stream().filter(r -> r.getDni().equals(idDriver)).findFirst().get();
	}

	@Override
	public void createDriver(DriverDTO driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDriver(DriverDTO driver) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteDriver(String id) {
		// TODO Auto-generated method stub

	}

}
