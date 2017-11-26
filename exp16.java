//WRITE A JAVA PROGRAM TO IMPLEMENT THE CONCEPT OF EXCEPTION HANDLING BY CREATING USER DEFINED EXCEPTION

class MyException extends Exception
{
	String str1;
	MyException(String str2)
	{
		str1 = str2;
	}
	public String toString()
	{
		return("Exception occured" + str1);
	}
}

class exp16
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Starting of try block");
			throw new MyException("\nThis is my error message");
		}
		catch(MyException e)
		{
			System.out.println("CATCH BLOCK");
			System.out.println(e);
		}
	}
}