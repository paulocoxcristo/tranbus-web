package cu.edu.cujae.pweb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cu.edu.cujae.pweb.dto.TourGroupDTO;

@Service
public class TourGroupServiceImpl implements TourGroupService{

	@Autowired
	private CountryService countryService;

	@Override
	public List<TourGroupDTO> getTourGroup() {
		
		List<TourGroupDTO> tourGroups = new ArrayList<>();
		tourGroups.add(new TourGroupDTO("1", 10, countryService.getCountryById("1"), false));
		tourGroups.add(new TourGroupDTO("2", 10, countryService.getCountryById("2"), false));
		tourGroups.add(new TourGroupDTO("3", 5, countryService.getCountryById("5"), false));
		tourGroups.add(new TourGroupDTO("4", 8, countryService.getCountryById("4"), false));

		return tourGroups;
	}

	@Override
	public TourGroupDTO getTourGroupById(String idGroup) {
		return getTourGroup().stream().filter(r -> r.getCountry().getIdCountry().equals(idGroup)).findFirst().get();
	}

	@Override
	public void createTourGroup(TourGroupDTO tourGroup) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateTourGroup(TourGroupDTO tourGroup) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteTourGroup(String id) {
		// TODO Auto-generated method stub

	}

}
