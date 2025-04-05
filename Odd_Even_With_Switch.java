import java.util.Scanner;
public class Odd_Even_with_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        switch (num % 2) {
            case 0:
                System.out.println(num + " is an even number.");
                break;
            case 1:
                System.out.println(num + " is an odd number.");
                break;
            // This case is not necessary, but included for completeness
            // since num % 2 can only be 0 or 1 for integers.
            // In Java, the switch statement can handle any integer value.
            // However, since we are only dealing with even and odd,
            // we can safely ignore this case.
            // If you want to handle unexpected cases, you can uncomment the following:
            default:
                System.out.println("Unexpected case: " + num);
                break;
            // If you want to handle negative numbers or other cases,
            // you can add additional logic here.
            // For example, if you want to handle negative numbers: 
            // if (num < 0) {
            //     System.out.println(num + " is a negative number.");
            // } else {
            //     System.out.println(num + " is a positive number.");
            // }
        }
    }
    
}
