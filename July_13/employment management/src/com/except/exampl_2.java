package com.except;

public class exampl_2 {

	int x = 10;
	public void m1() {
		System.out.println("Value of x is: " +x);
	}

	public static void main(String[] args) {
		
		example_2 obj = new example_2();
		obj.m1();
		
		try {
			Thread.sleep(10000);
			
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}	
	