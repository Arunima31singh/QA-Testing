package com.Abstraction;


abstract class Bank{
	
	public void deposite() {
		System.out.println("Money Deopsited");
	}
	
	public void withdraw() {
		System.out.println("Money withdrawn");
	}
	
	abstract void calculateIntreset();
}

class SBI extends Bank {
	@Override
	void  calculateIntreset() {
		System.out.println("SBI Interest = 6.5%");
		
	}
}

class HDFC extends Bank {
	@Override
	void  calculateIntreset() {
		System.out.println("HDFC Interest = 7%");
		
	}
}

class ICICI extends Bank {
	@Override
	void  calculateIntreset() {
		System.out.println("ICICI Interest = 6.8%");
		
	}
}
 
public class Abstraction_bank {

	public static void main(String[] args) {
		SBI sc = new SBI();
		sc.deposite();
		sc.withdraw();
		sc.calculateIntreset();
		

	}

}
