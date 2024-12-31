package exercise;
import java.util.Scanner;

class MathCalculator {
    double num1, num2;

    public int displayInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my Calculator");
        System.out.println("--------------------------");
        System.out.println("\t 1. Addition");
        System.out.println("\t 2. Subtraction");
        System.out.println("\t 3. Multiply");
        System.out.println("\t 4. Division");
        System.out.println("\t 5. Exit");

        System.out.print("Please input your choice: ");
        return input.nextInt();
    }

    public void inputNumber() {
        Scanner math = new Scanner(System.in);
        System.out.print("Please input the first number: ");
        num1 = math.nextDouble();
        System.out.print("Please input the second number: ");
        num2 = math.nextDouble();
    }

    public void displayResult(int operation) {
        inputNumber();
        double result = 0;
        switch (operation) {
            case 1:
                result = num1 + num2;
                System.out.println("The result of addition is: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("The result of subtraction is: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("The result of multiplication is: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result of division is: " + result);
                } else {
                    System.out.println("Division by zero is not allow");
                }
                break;
            case 5:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}

public class exercise2 {
    public static void main(String[] args) {
        MathCalculator calculator = new MathCalculator();
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            choice = calculator.displayInfo();
            if (choice >= 1 && choice <= 5) {
                calculator.displayResult(choice);
            } else {
                System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }
}
