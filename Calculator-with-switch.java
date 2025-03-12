import java.util.*;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalc = true;

        while (continueCalc) {
            double a = getValidNumber(sc, "Enter the first number: ");
            double b = getValidNumber(sc, "Enter the second number: ");
            
            char op = getValidOperator(sc);
            
            calculateAndDisplay(a, b, op);
            
            continueCalc = askToContinue(sc);
        }
        
        System.out.println("Thank you for using the calculator!");
        sc.close();
    }
    
    // Method to get valid number input
    private static double getValidNumber(Scanner sc, String prompt) {
        double number;
        while (true) {
            System.out.print(prompt);
            try {
                number = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number");
                sc.next(); // Clear invalid input
            }
        }
        return number;
    }
    
    // Method to get valid operator
    private static char getValidOperator(Scanner sc) {
        System.out.println("Choose an operator:");
        System.out.println("[+] Addition  \n[-] Subtraction  \n[*] Multiplication  \n[/] Division  \n[%] Modulus");
        System.out.print("Enter operator: ");
        return sc.next().charAt(0);
    }
    
    // Method to perform calculation and display result
    private static void calculateAndDisplay(double a, double b, char op) {
        double result;
        System.out.print(a + " " + op + " " + b + " = ");
        
        switch (op) {
            case '+':
                result = a + b;
                System.out.println(result);
                break;
            case '-':
                result = a - b;
                System.out.println(result);
                break;
            case '*':
                result = a * b;
                System.out.println(result);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed");
                } else {
                    result = a / b;
                    System.out.println(result);
                }
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Error: Modulus by zero is not allowed");
                } else {
                    result = a % b;
                    System.out.println(result);
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
                break;
        }
    }
    
    // Method to ask if user wants to continue
    private static boolean askToContinue(Scanner sc) {
        while (true) {
            System.out.print("Continue calculating? (yes/no): ");
            String response = sc.next().toLowerCase();
            if (response.equals("yes") || response.equals("y")) {
                return true;
            } else if (response.equals("no") || response.equals("n")) {
                return false;
            } else {
                System.out.println("Please enter 'yes' or 'no'");
            }
        }
    }
}
