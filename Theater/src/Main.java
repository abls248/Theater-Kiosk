import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt() ;

        // Check if the user is 21 or over
        if ( age >= 21 ) {
            System.out.println(" You get a wrist band." );
        }
    }
}