//WRITE A PROGRAM TO DEMONSTRATE THE USE OF NESTED CLASS

class Outer
{
	public void display()
	{
		Inner obj = new Inner();
		obj.show();
	}
	
	class Inner
	{
		public void show()
		{
			System.out.println("Inside Inner");
		}
	}
}

class exp5
{
	public static void main(String args[])
	{
		Outer obj = new Outer();
		obj.display();
	}
}