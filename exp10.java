// WRITE A JAVA PROGRAM TO DEMONSTRATE THE USE OF INTERFACE

interface myinterface
{
	public void method1();
	public void method2();
}

class exp10 implements myinterface
{
	public void method1()
	{
		System.out.println("Implemented method1");
	}
	public void method2()
	{
		System.out.println("Implemented method2");
	}
	
	public static void main(String args[])
	{
		myinterface obj = new exp10();
		obj.method1();
		obj.method2();
	}
}