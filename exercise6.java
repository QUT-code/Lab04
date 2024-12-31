package exercise;

public class exercise6 {

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        int number = 6;
        System.out.println("Factorial of " + number + " (Iterative): " + factorial(number));
        System.out.println("Factorial of " + number + " (Recursive): " + factorialRecursive(number));
    }
}
