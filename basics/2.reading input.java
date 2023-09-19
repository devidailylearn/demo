import java.util.Scanner;

class demo
{
public static void main(String a[])
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
       	int n1=sc.nextInt();
		System.out.println(n1);
		 System.out.println("enter the Name");
		String n2=sc.next();
		System.out.println(n2);
        System.out.println("enter the cgpa");
        float n3=sc.nextFloat();
		System.out.println(n3);
		sc.close();
		}
}