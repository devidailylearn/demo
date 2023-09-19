import java.util.Scanner;
class Circle
{
	float radius;
	
	void getRadius(float rad )
	{
		radius= rad;
	}
		
	float area()
	{
	 float res= 3.14f* radius*radius;
	  System.out.println("Area of circle is"+ res);
	}
	
	
	void circumference()
	{
	 float result=2* 3.14f * radius;
	 System.out.println("Circumference of circle is"+ result);
	
	}
}
class demo
{
public static void main(String a[])
	{
	Scanner sc = new Scanner(System.in);
	
	Circle o1 = new Circle();	
		
	System.out.println("enter the Radius");
	float rad= sc.nextFloat();	
	o1.getRadius(rad);

	System.out.println("\nstudent Details");
	float a =o1.area();	
	float c =o1.circumference();
	System.out.println("Area of circle is :"+a);
	System.out.println("cirucumference of circle is :"+c);
	
	
	}
}