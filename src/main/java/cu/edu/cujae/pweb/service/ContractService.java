package cu.edu.cujae.pweb.service;

import java.util.List;

import cu.edu.cujae.pweb.dto.ContractDTO;

public interface ContractService {
	public List<ContractDTO> getContracts();
	public ContractDTO getContractById(String contractId);
	public void createBrand(ContractDTO contract);
	public void updateBrand(ContractDTO contract);
	public void deleteBrand(String idBrand);

}
