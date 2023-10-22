package cu.edu.cujae.pweb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cu.edu.cujae.pweb.dto.CountryDTO;

@Service
public class CountryServiceImpl implements CountryService{

	@Override
	public List<CountryDTO> getCountries() {
		
		List<CountryDTO> countries = new ArrayList<>();
		countries.add(new CountryDTO("1", "Cuba"));
		countries.add(new CountryDTO("2", "Estados Unidos"));
		countries.add(new CountryDTO("3", "España"));
		countries.add(new CountryDTO("4", "Israel"));
		countries.add(new CountryDTO("5", "Alemania"));
		countries.add(new CountryDTO("6", "Canadá"));
		countries.add(new CountryDTO("7", "China"));
		
		return countries;
	}

	@Override
	public CountryDTO getCountryById(String countryId) {
		return getCountries().stream().filter(r -> r.getIdCountry().equals(countryId)).findFirst().get();
	}

	@Override
	public void createCountry(CountryDTO country) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCountry(CountryDTO country) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCountry(String id) {
		// TODO Auto-generated method stub
		
	}

}
