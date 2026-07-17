package com.constructors;

public class constructors_eaxmpl_1 {
	
	public constructors_eaxmpl_1() {
		System.out.println("This is the constructor block");
		
	}
	
	public void method() {
		System.out.println("This is method block";)
	}

	public static void main(String[] args) {
		constructors_eaxmpl_1 obj = new constructors_eaxmpl_1(); //deafult constructor
		//constructors block will automaticly invoked
		
		// need to call explicitly for the methods
		
		obj.method();

	}

}
