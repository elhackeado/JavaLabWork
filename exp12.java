//WRITE A PROGRAM IN JAVA TO IMPLEMENT THE CONCEPT OF IMPORTING CALSSES FROM USER DEFINED PACKAGE AND CREATING PACKAGE

package pack;
public class A
{
	public void msg()
	{
		System.out.println("Hello");
	}
}


//NEW PROGRAM FOR USING PACKAGE

package mypackage;
import pack.*;

class exp12
{
	public static void main(String args[])
	{
		A obj = new A();
		obj.msg();
	}
}