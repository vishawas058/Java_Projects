import java.util.Scanner;
// This program prints all even numbers from 1 to n
// where n is a positive integer input by the user.
// The program uses a for loop to iterate through numbers from 1 to n   
public class Even_till_N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();
        System.out.println("Even numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        scanner.close();
        // The program first prompts the user to enter a positive integer n.
        // It then uses a for loop to iterate through all numbers from 1 to n.
        // Inside the loop, it checks if the current number i is even by using the modulus operator (%). 
    }
}
