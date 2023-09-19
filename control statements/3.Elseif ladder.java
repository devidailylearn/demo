import java.util.Scanner;
//nested if statement example
class demo
{
public static void main(String arg[])
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the a");
       	int a=sc.nextInt();		
		System.out.println("enter the b");
		int  b=sc.nextInt();
		System.out.println("enter the c");
		int  c=sc.nextInt();
		
		if (a > b &&  a>c)
			{
				System.out.println("A is greater");
			}
			else if (b>c)
			{
				System.out.println("b is greater");
			}
			else
			{
				System.out.println("c is greater");
			}
			    
		sc.close();
		}
}