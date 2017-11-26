//WRITE A JAVA PROGRAM TO IMPLEMENT THE CONCEPT OF THREADING BY EXTENDING THREAD CLASS

class exp13 extends Thread
{
	public void run()
	{
		System.out.println("My Thread Is Running ");
	}
	
	public static void main(String args[])
	{
		Threading obj = new Threading();
		obj.start();
	}
}