
import java.util.Scanner;
 class demo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any caracter : ");
        char c = scanner.next().charAt(0);

        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {

            System.out.println(c + " is A ALPHABET.");

        } else {

            System.out.println(c + " is NOT A ALPHABET.");

        }
    }
}