class Student
{
	int rno;
	void show()
	{
		System.out.println("RollNumber"+ rno);
	}
			
}

class demo
{
public static void main(String a[])
	{
	Student o1 = new Student();
	o1.rno= 45;
	o1.show();
	}
}