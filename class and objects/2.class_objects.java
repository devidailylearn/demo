
import java.util.Scanner;
class Student
{
	int rno;
	String sname;
	
	void display()
	{
	System.out.println("RollNo: "+rno );
	System.out.println("Name: "+sname );
	}
		
}


class demo
{
public static void main(String a[])
	{
	System.out.println("hai welcome to departemnt");

	Student o1 = new Student();
	o1.rno=25;
	o1.sname="john";
	o1.display();
	
	}
}