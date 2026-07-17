package com.MethodOverriding;

class bank{
	public void calculateInterest() {
		System.out.println("General Interst Calculator");
		
	}
}

class SBI extends bank {
	@Override
	public void calculateInterest() {
		System.out.println("SBI Interest = 6.5%");
	}
}

class HDFC extends bank {
	@Override
	public void calculateInterest() {
		System.out.println("HDFC Interest = 7%");
	}
	
}

class ICICI extends bank {
	@Override
	public void calculateInterest() {
		System.out.println("ICICI Interest = 6.8%");
	}
	
}

public class Exampele_bank {

	public static void main(String[] args) {
		SBI sb = new SBI();
		sb.calculateInterest();
		
		HDFC hd = new HDFC();
		hd.calculateInterest();
		

	}

}
