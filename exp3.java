//WRITE A PROGRAM TO DEFINE A CLASS, DEFINE INSTANCE METHOD AND OVERLOAD THEM AND USE THEM FOR DYANMIC METHOD INVOCATION

class Animal
{
	public void callEat()
	{
		eat();
	}
	
	private void eat()
	{
		System.out.println("In animal eat");
	}
}

public class exp3 extends Animal
{
	public static void main(String args[])
	{
		Animal h = new Animal();
		h.callEat();
	}
}