//WRITE A JAVA PROGRAM TO DEMONSTRATE THE USE OF SUB-CLASS

class Calculation
{
	int z;
	
	public void addition(int x, int y)
	{
		z=x+y;
		System.out.println("The sum of the given number is : " + z);
	}
	
	public void subtraction(int x, int y)
	{
		z=x-y;
		System.out.println("The difference is : " + z);
	}
}

public class exp4 extends Calculation
{
	public void multiplication(int x, int y)
	{
		z=x*y;
		System.out.println("The product is : " + z);
	}
	
	public static void main(String args[])
	{
		int a=20 , b=10;
		exp4 obj = new exp4();
		obj.addition(a,b);
		obj.subtraction(a,b);
		obj.multiplication(a,b);
	}
}