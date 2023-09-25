/*package whatever //do not write package name here */
import java.io.*;
class Demo {
	public static void main (String[] args) {
        outer:
		for(int i = 1; i <= 3; i++)
        {  inner:
            for(int j = 1; j <= 5; j++)
            {   
                if ( j== 3)
                  break outer; ;
                System.out.println(i +  " " +j);
            }
		
		}
	}
}
