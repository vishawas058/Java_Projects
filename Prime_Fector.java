// This program finds the factors of a given number
// It takes a number as input from the user and prints its factors
import java.util.*;
// Importing the Scanner class from the java.util package
// The Scanner class is used to take input from the user
public class Prime_Factor {
    // The main method is the entry point of the program
    // It is where the program starts executing
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        // The Scanner class is used to take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factors: ");
        // Taking input from user
        int a = sc.nextInt();
        // Finding factors of the number
        // Initializing an empty string to store factors
        // The factors of a number are the numbers that divide it evenly
        String st = "";
        // Loop to find factors
        // Loop starts from 1 to the number itself
        for ( int i= 1; i <= a; i++) {
            // If the number is divisible by i, then i is a factor of the number
            // The modulus operator % is used to check if a number is divisible by another number
            if (a % i == 0) {
                // If i is a factor, append it to the string st
                // The + operator is used to concatenate strings in Java
                st = st + i + " ";
            }
        }
        // Print the factors of the number
        // The System.out.println() method is used to print the output to the console
        System.out.println("The factors of " + a + " are: ");
        // The + operator is used to concatenate strings in Java
        // The st variable contains all the factors of the number
        System.out.println(a + " = " + st);
        // Close the scanner object to prevent memory leaks
        // The close() method is used to close the scanner object
        sc.close();
    }
}
