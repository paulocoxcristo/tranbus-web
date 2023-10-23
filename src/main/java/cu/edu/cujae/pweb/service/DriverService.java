package cu.edu.cujae.pweb.service;

import java.util.List;

import cu.edu.cujae.pweb.dto.DriverDTO;

public interface DriverService {
	List<DriverDTO> getDriver();
	DriverDTO getDriverByDni(String idDriver);
	void createDriver(DriverDTO driver);
	void updateDriver(DriverDTO driver);
	void deleteDriver(String id);
}
