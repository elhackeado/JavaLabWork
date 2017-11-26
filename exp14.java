//WRITE A JAVA PROGRAM TO IMPLEMENT THE CONCEPT OF THREADING BY IMPLEMENTING RUNNAVBLE INTERFACE

class exp14 implements Runnable 
{
	public void run()
	{
		System.out.println("My Thread Is In Running State");
	}
	
	public static void main(String args[])
	{
		Threading obj = new Threading();
		Thread tobj = new Thread(obj);
		tobj.start();
	}
}