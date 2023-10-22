package cu.edu.cujae.pweb.dto;

public class DrivingTeamDTO {
	private String idDvr1;
	private String idDvr2;
	private String carPlate;
	
	public DrivingTeamDTO(String idDvr1, String idDvr2, String carPlate) {
		setIdDvr1(idDvr1);
		setIdDvr2(idDvr2);
		setCarPlate(carPlate);		
	}
	
	public void setIdDvr1(String idDvr1) {
		this.idDvr1 = idDvr1;
	}
	
	public void setIdDvr2(String idDvr2) {
		this.idDvr2 = idDvr2;
	}
	
	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}
	
	public String getIdDvr1() {
		return this.idDvr1;
	}
	
	public String getIdDvr2() {
		return this.idDvr2;
	}
	
	public String getCarPlate() {
		return this.carPlate;
	}
}
