import java.util.Scanner;
//if statement example
class demo
{
public static void main(String a[])
			{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Number 1");
       	int n1=sc.nextInt();		
		System.out.println("enter the Number 2");
		int  n2=sc.nextInt();
		
		if (n1 > n2)
		{
			System.out.println("a is greater than b");
		}
		else
		{
			System.out.println("b is greater than a");
		}
		    
		sc.close();
		}
}