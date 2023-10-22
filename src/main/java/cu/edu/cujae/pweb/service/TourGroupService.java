package cu.edu.cujae.pweb.service;

import java.util.List;
import cu.edu.cujae.pweb.dto.TourGroupDTO;

public interface TourGroupService {
	List<TourGroupDTO> getTourGroup();
	TourGroupDTO getTourGroupById(String idGroup);
	void createTourGroup(TourGroupDTO tourGroup);
	void updateTourGroup(TourGroupDTO tourGroup);
	void deleteTourGroup(String id);
}
