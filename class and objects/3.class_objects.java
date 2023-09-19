class Student
{
	int rno;
	String sname;
	
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
	
	Student o1 = new Student();	
	Student o2 = new Student();	
	
	o1.rno=111;
	o1.sname="abi";
	
	o2.rno=222;
	o2.sname="banu";
	
	System.out.println("student Details");
	o1.display();
	o2.display();
	}
}