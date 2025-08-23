package banking.module;
import java.util.*;

import banking.module.services.BankingService;
import banking.module.services.BankingServiceImpl;

public class BankingMain {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        BankingService bank = new BankingServiceImpl();
	        int choice;

	        do {
	            System.out.println("\nBanking System");
	            System.out.println("1. Add Customers");
	            System.out.println("2. Add Accounts");
	            System.out.println("3. Add Beneficiary");
	            System.out.println("4. Add Transaction");
	            System.out.println("5. Find Customer by Id");
	            System.out.println("6. List all Accounts of specific Customer");
	            System.out.println("7. List all transactions of specific Account");
	            System.out.println("8. List all beneficiaries of specific customer");
	            System.out.println("9. Exit");
	            System.out.print("Enter your choice : ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Customer Id: ");
	                    int cid = sc.nextInt();
	                    sc.nextLine();
	                    System.out.print("Name: ");
	                    String cname = sc.nextLine();
	                    System.out.print("Address: ");
	                    String caddr = sc.nextLine();
	                    System.out.print("Contact No: ");
	                    int contact = sc.nextInt();
	                    bank.addCustomer(new Customer(cid, cname, caddr, contact));
	                    break;

	                case 2:
	                    System.out.print("Account Id: ");
	                    int aid = sc.nextInt();
	                    System.out.print("Customer Id: ");
	                    int ac_cid = sc.nextInt();
	                    sc.nextLine();
	                    System.out.print("Account Type (Saving/Current): ");
	                    String type = sc.nextLine();
	                    System.out.print("Balance: ");
	                    double bal = sc.nextDouble();
	                    bank.addAccount(new Account(aid, ac_cid, type, bal));
	                    break;

	                case 3:
	                    System.out.print("Beneficiary Id: ");
	                    int bid = sc.nextInt();
	                    System.out.print("Customer Id: ");
	                    int bcid = sc.nextInt();
	                    sc.nextLine();
	                    System.out.print("Beneficiary Name: ");
	                    String bname = sc.nextLine();
	                    System.out.print("Account Number: ");
	                    int accNo = sc.nextInt();
	                    System.out.print("Bank Details: ");
	                    String bbank = sc.nextLine();
	                    bank.addBeneficiary(new Beneficiary(bid, bcid, bname, accNo, bbank));
	                    break;

	                case 4:
	                    System.out.print("Transaction Id: ");
	                    int tid = sc.nextInt();
	                    System.out.print("Account Id: ");
	                    int taid = sc.nextInt();
	                    sc.nextLine();
	                    System.out.print("Type (Deposit/Withdrawal): ");
	                    String ttype = sc.nextLine();
	                    System.out.print("Amount: ");
	                    double amt = sc.nextDouble();
	                    bank.addTransaction(new Transaction(tid, taid, ttype, amt));
	                    break;

	                case 5:
	                    System.out.print("Enter Customer Id: ");
	                    int fid = sc.nextInt();
	                    System.out.println(bank.findCustomerById(fid));
	                    break;

	                case 6:
	                    System.out.print("Enter Customer Id: ");
	                    int caid = sc.nextInt();
	                    for (Account acc : bank.getAccountsByCustomerId(caid))
	                        System.out.println(acc);
	                    break;

	                case 7:
	                    System.out.print("Enter Account Id: ");
	                    int taid2 = sc.nextInt();
	                    for (Transaction tr : bank.getTransactionsByAccountId(taid2))
	                        System.out.println(tr);
	                    break;

	                case 8:
	                    System.out.print("Enter Customer Id: ");
	                    int bcustid = sc.nextInt();
	                    for (Beneficiary b : bank.getBeneficiariesByCustomerId(bcustid))
	                        System.out.println(b);
	                    break;

	                case 9:
	                    System.out.println("Thank you!");
	                    break;

	                default:
	                    System.out.println("Invalid choice!");
	            }
	        } while (choice != 9);

	        sc.close();
	}
}
