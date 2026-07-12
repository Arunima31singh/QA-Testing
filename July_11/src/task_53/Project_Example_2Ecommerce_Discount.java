package task_53;

public class Project_Example_2Ecommerce_Discount {

	public static void main(String[] args) {
		
		double purchaseAmount = 6000;

        double discount = (purchaseAmount >= 5000) ? 500 : 0;

        System.out.println("Discount = ₹" + discount);
	}

}
