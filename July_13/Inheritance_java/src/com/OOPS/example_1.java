package com.OOPS;

class Account{
	 String accountHolder = "XYZ";
	 double balance = 0;
	 
	 public void deposit(double amount) {
		 balance = balance + amount;
		 System.out.println("Amount Deposited " + amount);
	 }
	 
	 public void withdrawl(double amount) {
		 balance = balance - amount;
		 System.out.println("Amount withdrawn: "+ amount);
	 }
	 
	 public void displaybalance() {
		 System.out.println("Current Balance:" + balance);
	 }
}

class SavingAcoount extends Account{
	public void calculateInterest() {
		double interest = balance * 5/100;
		System.out.println("Interest  Earned: " + interest);
	}
}

public class example_1 {

	public static void main(String[] args) {
		SavingAcoount sa = new SavingAcoount();
		System.out.println("Account Holder: " + sa.accountHolder);
		sa.deposit(50000);
		sa.withdrawl(1000);
		sa.displaybalance();
		sa.calculateInterest();
		

	}

}
