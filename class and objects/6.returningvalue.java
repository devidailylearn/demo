//Adding a Method That Takes Parameters
//Returning a Value
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
	 return res;
	}
	
	
	float circumference()
	{
	 float result=2* 3.14f * radius;
	 return result;
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
	
	float r=o1.area();
	float r1=o1.circumference();
	
	System.out.println("Area of circle is"+ r);
	System.out.println("Circumference of circle is"+ r1);
	 
	 
	
	}
}