package banking_system.module.module4;

public class Beneficiary {
	private int beneficiaryID;
	private int customerID;
	private String name;
	private int accountNumber;
	private String bankDetails;
	
	public Beneficiary(int beneficiaryID, int customerID, String name, int accountNumber, String bankDetails) {
		// TODO Auto-generated constructor stub
		this.beneficiaryID = beneficiaryID;
		this.accountNumber = accountNumber;
		this.name = name;
		this.accountNumber = accountNumber;
		this.bankDetails = bankDetails;
	}
	public void setBeneficiaries(int beneficiaryID, int customerID, String name, int accountNumber, String bankDetails) {
		this.beneficiaryID = beneficiaryID;
		this.accountNumber = accountNumber;
		this.name = name;
		this.accountNumber = accountNumber;
		this.bankDetails = bankDetails;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getBankDetails() {
		return bankDetails;
	}
	public int getBeneficiaryID() {
		return beneficiaryID;
	}
	public int getCustomerID() {
		return customerID;
	}
	public String getName() {
		return name;
	}
}
