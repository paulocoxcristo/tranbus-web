package cu.edu.cujae.pweb.dto;

public class ExtraServDTO {
	private String carPlate;
	private int idContract;
	private int kmDriven;
	private double amountMoney;
	
	public ExtraServDTO(String carPlate, int idContract, int kmDriven, double amountMoney) {
		setCarPlate(carPlate);
		setIdContract(idContract);
		setKmDriven(kmDriven);
		setAmountMoney(amountMoney);
	}
	
	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}
	
	public void setIdContract(int idContract) {
		this.idContract = idContract;
	}
	
	public void setKmDriven(int kmDriven) {
		this.kmDriven = kmDriven;
	}
	
	public void setAmountMoney(double amountMoney) {
		this.amountMoney = amountMoney;
	}
	
	public String getCarPlate() {
		return this.carPlate;
	}
	
	public int getIdContract() {
		return this.idContract;
	}
	
	public int getKmDriven() {
		return this.kmDriven;
	}
	
	public double getAmountMoney() {
		return this.amountMoney;
	}
}
