package task_53;

public class Instanceof_Operator {

	public static void main(String[] args) {
		
		String name = "Java";

        System.out.println(name instanceof String);
        
        // Real-World Example
        
        Object obj = "Automation";

        if (obj instanceof String) {
            System.out.println("It is a String object");
        }

	}

}
