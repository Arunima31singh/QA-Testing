package com.overlodaing;


public class Example_1 {
	public void transfer(double amount) {
		System.out.println("trnasferred amount: " + amount);
		
	}
	
	public void transfertransfer(double amount, String acoountNumber) {
		System.out.println("trnasferred " + amount + "to account: " + accountNumber);
	}
	
	public void transfer(double amount, String accountNumber, String remarks) {
		System.out.println("trnasferred " + amount);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Remarks: " + remarks);
		
		
	}
	
	public static void main(String[] args) {
		Example_1 mt = new Example_1();
		mt.transfer(100000);
		mt.transfer(5000, "sbin23456");
		mt.transfer(1000, "2441362", "House rent");
	}
		
}


