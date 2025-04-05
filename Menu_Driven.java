import java.util.Scanner;
/*
 * This program implements a simple menu-driven calculator that performs basic arithmetic operations.
 * The user is prompted to enter two numbers and then choose an operation from the menu.
 * The program will then perform the selected operation and display the result.
 */
// Menu_Driven.java
// This program is a simple menu-driven calculator that performs basic arithmetic operations.
// It prompts the user to enter two numbers and then allows the user to choose an operation from a menu.
// The program will then perform the selected operation and display the result.
// The operations include addition, subtraction, multiplication, division, and modulus.
// The program also handles division by zero and invalid menu choices gracefully.
// The program uses a switch statement to handle the user's choice and perform the corresponding operation.
// The program uses the Scanner class to read user input from the console.
// The program is written in Java and can be compiled and run using any Java IDE or command line.
// The program is designed to be simple and easy to understand, making it suitable for beginners learning Java.
// Menu_Driven.java
// This program is a simple menu-driven calculator that performs basic arithmetic operations.
public class Menu_Driven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, choice;
        System.out.println("Enter two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Exit");
        System.out.println("Enter your choice:");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Addition: " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction: " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Division: " + (a / b));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            case 5:
                System.out.println("Modulus: " + (a % b));
                break;
            case 6:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
        sc.close();
    }
}
