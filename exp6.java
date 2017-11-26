//WRITE A JAVA PROGRAM TO IMPLEMENT ARRAY OF OBJECTS

class Student
{
	int marks;
}

public class exp6
{
	public static void main(String args[])
	{
		Student std[] = new Student[3];
		std[0] = new Student();
		std[1] = new Student();
		std[2] = new Student();
		std[0].marks = 40;
		std[1].marks = 50;
		std[2].marks = 60;
		System.out.println("\n 3 Students average marks : "
		+ ((std[0].marks+std[1].marks+std[2].marks)/3));
	}
}