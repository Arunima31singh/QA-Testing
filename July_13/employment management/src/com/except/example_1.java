package com.except;

public class example_1 {
	int x = 10;
	public void m1() {
		System.out.println("Value of x is: " +x);
	}

	public static void main(String[] args) {
		
		example_1 obj = new example_1();
		obj.m1();
		
		try {
			Thread.sleep(10000);
			
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
