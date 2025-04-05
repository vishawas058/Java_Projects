import java.util.Scanner;
public class Read_Gender_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char gen;
        System.out.printf("Enter the Gender(M/F) : ");
        gen = sc.next().charAt(0);
        switch (gen) {
            case 'M':
            case 'm':
                System.out.printf("Male");
                break;
            case 'F':
            case 'f':
                System.out.printf("Female");
                break;
            default:
                System.out.printf("Unspecified Gender")
                break;
        }
        // The default case handles any input that is not 'M', 'm', 'F', or 'f'.
                // This includes any other characters or numbers.
                // You can also add a message to inform the user about the valid inputs.
                // For example:
                // System.out.printf("Invalid input. Please enter 'M' or 'F'.");
        // This will help the user understand what went wrong.
        // Note: The default case is optional, but it's a good practice to include it
    }
}
