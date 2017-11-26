//WRITE A JAVA PROGRAM TO IMPLEMENT MULTILEVEL INHERITENCE BY APPLYING VARIOUS ACCESS CONTROL TO ITS DATA MEMBER AND METHODS

class car
{
	public car()
	{
		System.out.println("Class car");
	}
	public void vehicleType()
	{
		System.out.println("VEHICLE TYPE : CAR");
	}
}

class maruti extends car
{
	public maruti()
	{
		System.out.println("CLASS MARUTI");
	}
	public void brand()
	{
		System.out.println("BRAND : MARUTI");
	}
	public void speed()
	{
		System.out.println("MAX : 90KMPH");
	}
}

class exp9 extends maruti
{
	public exp9()
	{
		System.out.println("Maruti Model : 800");
	}
	public void speed()
	{
		System.out.println("MAX : 80KMPH");
	}
	
	public static void main(String args[])
	{
		exp9 obj = new exp9();
		obj.vehicleType();
		obj.brand();
		obj.speed();
	}
}