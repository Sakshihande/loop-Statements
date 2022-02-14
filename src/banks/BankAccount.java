package banks;

public class BankAccount {

	//BanckAccount methods
	private String accountName;
	private String accountNumber;
	  private double balance;
	public BankAccount(String accNumber, String accName) {
		// TODO Auto-generated constructor stub
	}
	public String getAccountName() {
		   return accountName;
	 }
		   public String getAccountNumber() {
			   return accountNumber;
		   }
		     public double  getBalance() {
		   return balance;
	   }
		 public boolean deposite(double amount) { 
			 if(amount>balance) {
		 balance=balance+amount;
		 return true;
		 }else {
			 return false;
			 
		 }
			  }
	  public boolean withdraw(double amount) {
		 if (amount>balance) {
			 return false;
		 }else {
			  balance=balance-amount;
			  return true;
			  }
	  }
	public boolean deposit(double amount) {
		// TODO Auto-generated method stub
		return false;
	}
	  }
	  
		 
		 
	
	

	
