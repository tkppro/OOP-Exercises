package exercises;

public class Ex14 {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public Ex11(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		
	}

	public int getId() {
		return id;
	}


	public String getFirstName() {
		return firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualSalary() {
		return salary*12;
	}
	
	public int raiseSalary(int percent)
	{
		return salary * percent;
	}

	@Override
	public String toString() {
		return "Ex14 [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
	}
	
	
	
	
}


