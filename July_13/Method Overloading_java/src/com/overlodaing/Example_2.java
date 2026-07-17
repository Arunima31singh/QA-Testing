package com.overlodaing;

public class Example_2 {


      public void search(String productName) {
			System.out.println("Searching product by name: " + productName);
		}
		
	public void search(String productName, String brand) {
			System.out.println("Searching by product and brand: " + productName + " " + brand);
		}
		
	public void search(String productName, String brand, int price) {
			System.out.println("Searching by product, brand and price: " + productName + " " + brand + " " + price);
			
		}
		
		
	public static void main(String[] args) {
			
			Example_2 s = new Example_2();
			
			s.search("Shampoo");
			s.search("Shampoo", "Dove");
			s.search("Shampoo", "Dove", 500);
			
	}

}


