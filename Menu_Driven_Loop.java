import java.util.*;
public class Menu_Driven_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        System.out.println("Welcome to the Grade Calculator!");
        System.out.println("This program will help you calculate your grade based on your percentage.");
        System.out.println("You can enter your percentage and get your grade.");
        System.out.println("You can also choose to continue or exit the program."); 
        do {
            System.out.print("Enter yours Mark in Percentage: ");
            int percentage = sc.nextInt();
            if (percentage >= 90) {
                System.out.println("Grade A");
            } else if (percentage >= 80) {
                System.out.println("Grade B");
            } else if (percentage >= 70) {
                System.out.println("Grade C");
            } else if (percentage >= 60) {
                System.out.println("Grade D");
            } else if (percentage >= 50) {
                System.out.println("Grade E");
            } else {
                System.out.println("Grade F");
            }
            System.out.print("Do you want to continue? (Y/N): ");
            choice = sc.next().charAt(0);
            if (choice == 'N' || choice == 'n') {
                System.out.println("Exiting the program.");
                break;
            } else if (choice != 'Y' && choice != 'y') {
                System.out.println("Invalid choice. Exiting the program.");
                break;
            }
        } while (choice == 'Y' || choice == 'y');
        sc.close();
        System.out.println("Thank you for using the Grade Calculator!");
        System.out.println("Goodbye!");
        System.out.println("Exiting the program.");
    }
}
