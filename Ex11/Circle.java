
	public class Circle{
		
		private double radius;
		private String color;
		
		public Circle()
		{
			radius = 1.0;
			color = "red";
			
		}
		
		public Circle(double radius)
		{
			this.radius = radius;
			
		}
		
		public Circle(double radius, String color)
		{
			this.radius = radius;
			this.color = color;
		}
		
		public double getRadius()
		{
			return radius;
		}
		
		public String getColor()
		{
			return color;
		}
		
		public void setRadius(double radius)
		{
			this.radius = radius;
		}
		
		public void setColor(String color)
		{
			this.color = color;
		}
		
		public String toString()
		{
			return "Circle[radius=" + radius + " color=" + color + "]";
		}
		
		public double getArea()
		{
			return radius * radius * Math.PI;
		}
		
		public static void main (String[] args)
		{
			Circle test = new Circle(2.0,"Blue");
			System.out.println("The circle has radius of " 
			+ test.getRadius() + " with color " + test.getColor()+ " and area of " + test.getArea());
			
		
	
		}
	}	
	
	