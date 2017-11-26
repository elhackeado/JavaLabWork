//WRITE A JAVA PROGRAM TO DEMONSTRATE USE OF EXTENDING INTERFACE

interface inf1
{
	public void method1();
}
interface inf2 extends inf1
{
	public void method2();
}

class exp11 implements inf2
{
	public void method1()
	{
		System.out.println("METHOD1");
	}
	public void method2()
	{
		System.out.println("METHOD2");
	}
	
	public static void main(String args[])
	{
		inf2 obj = new exp11();
		obj.method1();
		obj.method2();
	}
}