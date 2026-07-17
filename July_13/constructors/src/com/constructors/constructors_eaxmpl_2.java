package com.constructors;

public class constructors_eaxmpl_2 {
	
	public constructors_eaxmpl_2(int a, int b) {
		int c = a+b;
		System.out.println("Sumation is: " + c);
		
	}
	
	//constructors2
	
	public constructors_eaxmpl_2(double a, double b) {
		double c = a + b;
		System.out.println("Sumation is: " + c);
	}
	
	public void display() {
		System.out.println("Constructor overloading is working successfully ");
	}

	public static void main(String[] args) {
		constructors_eaxmpl_2 obj = new constructors_eaxmpl_2(10,20);
		obj.display();
		
		constructors_eaxmpl_2 sij = new constructors_eaxmpl_2(20.55, 30.78);
		sij.display();
		

	}

}
