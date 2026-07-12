package task_53;

public class Assignment_Operators {

	public static void main(String[] args) {
		int balance = 1000;

        balance += 500;
        System.out.println(balance);

        balance -= 200;
        System.out.println(balance);

        balance *= 2;
        System.out.println(balance);

        balance /= 2;
        System.out.println(balance);

        balance %= 300;
        System.out.println(balance);
        
        // real life Bank example//
        
        int accountBalance = 10000;

        accountBalance += 500;

        System.out.println("Balance = ₹" + accountBalance);
	}

}
