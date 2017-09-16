
	public class Rectangle{
		
		private float length;
		private float width;
		
		public Rectangle()
		{
			length = 1.0f;
			width = 1.0f;
		}
		
		public Rectangle(float length, float width)
		{
			this.length = length;
			this.width = width;
		}
		
		public float getLength()
		{
			return length;
		}
		
		public void setLength(float length)
		{
			this.length = length;
		}
		
		public float getWidth()
		{
			return width;
		}
		
		public void setWidth(float width)
		{
			this.width = width;
		}
		
		public double getArea()
		{
			return length * width;
		}
		
		public double getPerimeter()
		{
			return (length + width) * 2;
		}
		
		
		public String toString()
		{
			return "Rectangle[length=" + length + "width=" + width + "]";
		}
		
		
		
		public static void main (String[] args)
		{
			Rectangle test1 = new Rectangle();
			System.out.println("The Rectangle has width and length : " 
			+ test1.getWidth() +" " +test1.getLength() + " and area of " + test1.getArea() +" and perimeter of " + test1.getPerimeter());

			
			Rectangle test = new Rectangle(3.0f,2.0f);
			System.out.println("The Rectangle has width and length : " 
			+ test.getWidth() +" " +test.getLength() + " and area of " + test.getArea() +" and perimeter of " + test.getPerimeter());

		}
	}	
	
	