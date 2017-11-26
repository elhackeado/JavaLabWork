//WRITE A JAVA PROGRAM TO IMPLEMENT THE CONCEPT OF EXCEPTION HANDLING USING PREDEFINED EXCEPTION

class exp15
{
	public static void main(String args[])
	{
		int num1 , num2;
		try
		{
			num1 = 0;
			num2 = 62/num1;
			System.out.println("I am at the end of try block");
		}
		catch(Exception e)
		{
			System.out.println("Arithmetic exception occured");
		}
		System.out.println("I am out of try-catch block");
	}
}