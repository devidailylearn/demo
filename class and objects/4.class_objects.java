import java.util.Scanner;
class Student
{
	int rno;
	String sname;
	
	void getData(int r,String RollNum)
	{
		rno= r;
		sname=RollNum;
	}
	
	void display()
	{
	System.out.println("RollNo: "+rno );
	System.out.println("student Name: "+sname );
	}
		
}
class demo
{
public static void main(String a[])
	{
	Scanner sc = new Scanner(System.in);
	
	Student o1 = new Student();	
	Student o2 = new Student();	
	
	System.out.println("enter the Rno");
	int rno= sc.nextInt();	
	System.out.println("enter the name");
	String name= sc.next();
		
	o1.getData(rno,name);
	
	System.out.println("enter the Rno");
	 rno= sc.nextInt();	
	System.out.println("eneter the name");
	 name= sc.next();
	o2.getData(rno,name);
	
	
	System.out.println("\nstudent Details");
	o1.display();
	o2.display();
	}
}