package banking.module;

public class Account {
		private int accountid;
		private int customerid;
		private String type;
		private double balance;
		
		public Account(int accountid,int customerid,String type,double balance) {
			this.accountid = accountid;
			this.customerid =customerid;
			this.type = type;
			this.balance = balance;
		}
		
		public void setAccount(int accountid,int customerid,String type,double balance) {
			this.accountid = accountid;
			this.customerid =customerid;
			this.type = type;
			this.balance = balance;
		}
		
		public int getAccountid() {
			return accountid;
		}
		
		public int getCustomerid() {
			return customerid;
		}
		
		public String getType() {
			return type;
		}
		
		public double getBalance() {
			return balance;
		}

		@Override
		public String toString() {
			return "Account [accountid=" + accountid + ", customerid=" + customerid + ", type=" + type + ", balance="
					+ balance + "]";
		}

		public void setBalance(double d) {
			// TODO Auto-generated method stub
			
		}
}
