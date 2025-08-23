package banking_system.module.module3;

import java.time.LocalDateTime;

public class Transaction {
	private int transactionId;
	private int accountID;
	private String type;
	private double amount ;
	private LocalDateTime timestamp;
	
	public Transaction(int accountId, String type, double amount) {
		this.accountID = accountId;
		this.amount = amount;
		this.type = type;
	}
	public void setTransactionDetails(int transactionId, LocalDateTime timestamp) {
		this.transactionId = transactionId;
		this.timestamp = timestamp;
	}
	public int getAccountID() {
		return accountID;
	}
	public double getAmount() {
		return amount;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public String getType() {
		return type;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", accountID=" + accountID + ", type=" + type
				+ ", amount=" + amount + ", timestamp=" + timestamp + "]";
	}
	
}
