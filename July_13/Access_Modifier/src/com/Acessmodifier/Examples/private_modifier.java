package com.Acessmodifier.Examples;

class A{
	int x = 100;
}

public class private_modifier {

	public static void main(String[] args) {
		A obj = new A();
		int output = obj.x;
		System.out.println("Outout is: " + output);

	}

}
