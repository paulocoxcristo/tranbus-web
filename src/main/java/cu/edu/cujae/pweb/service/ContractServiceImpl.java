package cu.edu.cujae.pweb.service;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import cu.edu.cujae.pweb.dto.ContractDTO;
import cu.edu.cujae.pweb.dto.CountryDTO;


@Service
public class ContractServiceImpl implements ContractService{

	@Override
	public List<ContractDTO> getContracts() {
		List<ContractDTO> contracts = new ArrayList();
		List<CountryDTO> c = new CountryServiceImpl().getCountries();
		contracts.add(new ContractDTO("1", "Fernando Diaz",    Date.valueOf("2023-03-01"), Date.valueOf("2023-08-31"), c.get(0), false));
		contracts.add(new ContractDTO("2", "Valentina Diaz",   Date.valueOf("2023-05-27"), Date.valueOf("2023-06-27"), c.get(2), false));
		contracts.add(new ContractDTO("3", "Manuel Jesus",     Date.valueOf("2023-05-31"), Date.valueOf("2023-06-05"), c.get(1), false));
		contracts.add(new ContractDTO("4", "Javier Fernandez", Date.valueOf("2023-04-15"), Date.valueOf("2023-05-15"), c.get(0), false));
		contracts.add(new ContractDTO("5", "Sara Perez",       Date.valueOf("2023-04-20"), Date.valueOf("2023-05-05"), c.get(0), false));		
		contracts.add(new ContractDTO("6", "Susana Fernandez", Date.valueOf("2023-05-01"), Date.valueOf("2023-05-20"), c.get(0), false));
		contracts.add(new ContractDTO("7", "Fernando Alonso",  Date.valueOf("2023-05-05"), Date.valueOf("2023-05-31"), c.get(0), false));
		
		return contracts;
	}

	@Override
	public ContractDTO getContractById(String contractId) {
		return getContracts().stream().filter(r -> r.getIdContract().equals(contractId)).findFirst().get();
	}

	@Override
	public void createBrand(ContractDTO contract) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBrand(ContractDTO contract) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBrand(String idBrand) {
		// TODO Auto-generated method stub
		
	}

}
