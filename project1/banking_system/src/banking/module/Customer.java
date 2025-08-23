package banking.module;

public class Customer {
	private int customerid;	
	private String name;
	private String address;
	private int contact;
	
	public Customer(int customerid,String name,String address,int contact) {
		this.customerid = customerid ;
		this.name = name ;
		this.address = address ;
		this.contact = contact ; 
	
	}	
	
	public void setCustomer(int customerid,String name,String address,int contact) {
		
		this.customerid = customerid ;
		this.name = name ;
		this.address = address ;
		this.contact = contact ; 
		
	}
	
	public int getCustomerid() {
		return customerid;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getContact() {
		return contact;
	}

	@Override
	public String toString() {
		return "Account [customerid=" + customerid + ", name=" + name + ", address=" + address + ", contact=" + contact
				+ "]";
	}
}
