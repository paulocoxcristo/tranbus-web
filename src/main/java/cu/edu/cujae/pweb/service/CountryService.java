package cu.edu.cujae.pweb.service;
import java.util.List;

import cu.edu.cujae.pweb.dto.CountryDTO;



public interface CountryService {
	List<CountryDTO> getCountries();
	CountryDTO getCountryById(String countryId);
	void createCountry(CountryDTO country);
	void updateCountry(CountryDTO country);
	void deleteCountry(String id);
}
