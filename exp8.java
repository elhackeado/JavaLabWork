//WRITE A JAVA PROGRAM TO IMPLEMENT INHERITENCE AND DEMONSTRATE THE USE OF METHOD OVERRIDING 

class Human
{
	public void eat()
	{
		System.out.println("Human is eating");
	}
}

class exp8 extends Human
{
	public void eat()
	{
		System.out.println("Boy is eating");
	}
	
	public static void main(String args[])
	{
		exp8 obj = new exp8();
		obj.eat();
	}
}