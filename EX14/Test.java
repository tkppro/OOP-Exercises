package exercises;

public class Test {

	public static void main(String [] args)
	{
		Ex14 c1 = new Ex14(16020006, "Dang" , "Minh Thang" , 160000);
	
		System.out.println("The employee :  " + c1.getId() +" " + c1.getFirstName() +" "+ c1.getLastName()+ " has salary " +c1.getSalary() + " and raise Salary " + c1.raiseSalary(10));
		
	}
}
