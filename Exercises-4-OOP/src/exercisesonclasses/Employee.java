package exercisesonclasses;
//Ex: The Employee Class.

public class Employee {

	private int ID;
	private int salary;
	private String firstName;
	private String lastName;

	public Employee(int ID, String firstName, String lastName, int salary) {
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getID() {
		return ID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		return firstName + lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAnnualSalary() {
		return salary * 12;

	}

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", salary=" + salary + ", firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}

	public int raiseSalary(int i) {
		this.salary = salary + (salary * i) / 100;
		return salary;
	}

}
