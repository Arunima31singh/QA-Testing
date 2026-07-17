
creat a java program using coonstructor stter and getter method for employee having id , name ans salary 



package setter_getter_usingconstructor;
		
class employee{
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	private String name;
	private float salary;
	private String ssn;
	
}

public class cs {

	public static void main(String all) {

		employee raghu = new employee(143, "Raghavendra BN", 1250000.500f, "56545646343");
	    employee shyam = new employee(144, "Shyam Kumar", 80000.00f, "98765432100"); // Assumed declaration for shyam

	    // Printing Raghu's details
	    System.out.println("Employee ID: \t\t" + raghu.getId());
	    System.out.println("Employee Name: \t\t" + raghu.getName());

	    // Printing Shyam's details
	    System.out.println("Employee Salary: \t" + shyam.getSalary());
	    System.out.println("Employee SSN: \t\t" + shyam.getSsn());

	    // Now updating salary of employee shyam
	    shyam.raiseSalary(15000.00f);

	    System.out.println("After updating....");
	    System.out.println("Salary = " + shyam.getSalary());
    }

}
