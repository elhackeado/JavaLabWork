//WRITE A JAVA PROGRAM TO DEFINE A CLASS, DEFINE ISNTANCE METHOD FOR SETTING AND RETRIEVING VALUE OF INSTANCE VARIABLE AND INSTANTIATE ITS OBJECT.

class exp
{
	private String name;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String newname)
	{
		name = newname;
	}
	
}

public class exp2
{
	public static void main(String args[])
	{
		exp obj = new exp();
		obj.setName("Amandeep Singh");
		System.out.println("Name : " + obj.getName());
	}
}