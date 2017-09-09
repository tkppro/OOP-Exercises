package exercises;

public class Test {

	public static void main(String [] args)
	{
		Ex15 c1 = new Ex15 ("16CSE", "pencil", 20, 70.0 );
		
		System.out.println("The item : " + c1.getId() + " " + c1.getDesc() + " has the quantity : " + c1.getQty() + " and unit price is " + c1.getUnitPrice() +" and get total : "+ c1.getTotal(70.0,20));
		
	}
}
