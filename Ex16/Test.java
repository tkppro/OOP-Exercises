package exercises;

public class Test {
	public static void main(String[] args)
	{
	
	Account a = new Account("1652", "Thang");
	//assertEquals(a.getId(),"1652");
	System.out.println(a.getId() + a.getName() + a.getBalance()) ;
	a = new Account("gf", "th", 12);
	System.out.println(a.getId() + a.getName() + a.getBalance()) ;
	
	}
	
}