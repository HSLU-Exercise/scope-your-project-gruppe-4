import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number:");
        int x = scanner.nextInt();

        System.out.print("Enter second number:");
        int y = scanner.nextInt();

        System.out.print("Choose operation (+, -, *, /):");
        System.out.println();
        String op = scanner.next();

        switch (op) {
            case "+":
                System.out.println("Result: " + calc.add(x, y));
                break;
            case "-":
                System.out.println("Result: " + calc.subtract(x, y));
                break;
            case "*":
                System.out.println("Result: " + calc.multiply(x, y));
                break;
            case "/":
                System.out.println("Result: " + calc.divide(x, y));
                break;
            default:
                System.out.println("Unknown operation");
        }
    }
}
