//WRITE A JAVA PROGRAM TO DEFINE A CLASS, DESCRIBE ITS CONSTRUCTOR, OVERLOAD THE CONSTRUCTOR AND INSTANTIATE ITS OBJECTS.

class exp1
{
	int b;
	exp1()
	{
		System.out.println("this is default constructor.");
	}
	exp1(int n)
	{
		b=n;
		System.out.println(b);
	}
	void show()
	{
		System.out.println("this is the method of class");
	}
	
	public static void main(String args[])
	{
		exp1 obj = new exp1(10);
		new exp1();
		obj.show();
	}
}