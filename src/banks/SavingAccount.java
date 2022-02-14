package banks;

public class SavingAccount extends BankAccount {
		private double interestRate;
		private double balance;
		
			public SavingAccount(String accName,String accNumber, double rate) {
			
			super(accName,accNumber);
				
				interestRate=rate;
				
			}
			public void addInterest() {
				double interest=getBalance()*interestRate/100;
				deposit(interest);
			}
			
				public double getBalance() {
					return getBalance();
					
				}
					 public boolean deposite(double amount) {
						 if(amount>0) {
							 balance = balance + amount;
							 return true;
						 }else {
							 return true;
						 }
						 
						 }
					 public boolean withdraw (double amount) {
						 if (amount>balance) {
							 return false;
						 }
						 else {
							 balance=balance-amount;
							 return true;
						 }
		

	

	}

}
