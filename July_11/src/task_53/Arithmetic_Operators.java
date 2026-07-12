package task_53;

public class Arithmetic_Operators {

	public static void main(String[] args) {
		int a = 20;
        int b = 5;

        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Remainder = " + (a % b));
        
        
        // real life example //
        
        int laptopPrice = 50000;
        int quantity = 2;

        int totalPrice = laptopPrice * quantity;

        System.out.println("Total Price = ₹" + totalPrice);
	}

}
