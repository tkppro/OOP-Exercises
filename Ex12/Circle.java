
	public class Circle{
		
		private double radius;
		
		public Circle()
		{
			radius = 1.0;
			
		}

		public Circle(double radius)
		{
			this.radius = radius;
			
		}
		
		public double getRadius()
		{
			return radius;
		}
		
		public void setRadius(double radius)
		{
			this.radius = radius;
		}
		
		public double getArea()
		{
			return radius * radius * Math.PI;
		}
		
		public double getCircumference()
		{
			return 2 * radius * Math.PI;
		}
		
		
		public String toString()
		{
			return "Circle[radius=" + radius + "]";
		}
		
		
		
		public static void main (String[] args)
		{
			Circle test1 = new Circle();
			System.out.println("The circle has radius of " 
			+ test1.getRadius() + " and area of " + test1.getArea() +" and circumference of " + test1.getCircumference());			

			Circle test = new Circle(3.0);
			System.out.println("The circle has radius of " 
			+ test.getRadius() + " and area of " + test.getArea() +" and circumference of " + test.getCircumference());

		}
	}	
	
	
