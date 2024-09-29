import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Select an Operation");
            System.out.println("1. Arithmetic Operations");
            System.out.println("2. Scientific Calculator");
            System.out.println("3. Unit Converter");
            System.out.println("4. Exit");

            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    ArithmeticOperations(sc);
                    break;
                case 2:
                    ScientificCalculator(sc);
                    break;
                case 3:
                    UnitConverter(sc);
                    break;
                case 4:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Invalid choice. Please Enter a vaild choice");
            }
        }
    }

    private static void ArithmeticOperations(Scanner sc) {
        System.out.println("Select an Operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4.Division");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                addition(sc);
                break;
            case 2:
                subtraction(sc);
                break;
            case 3:
                multiplication(sc);
                break;
            case 4:
                division(sc);
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid operation");
        }
    }

    private static void addition(Scanner sc) {
        System.out.println("Enter two numbers");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double r = n1 + n2;
        System.out.println("Result: " + r);
    }

    private static void subtraction(Scanner sc) {
        System.out.println("Enter two numbers");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double r = n1 - n2;
        System.out.println("Result: " + r);
    }

    private static void multiplication(Scanner sc) {
        System.out.println("Enter two numbers");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double r = n1 * n2;
        System.out.println("Result: " + r);
    }

    private static void division(Scanner sc) {
        System.out.println("Enter two numbers");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        if (n2 == 0) {
            System.out.println("Division by zero not allowed");
        } else {
            double r = n1 / n2;
            System.out.println("Result: " + r);
        }

    }

    private static void ScientificCalculator(Scanner sc) {
        System.out.println("Select Operation:");
        System.out.println("1. Square Root");
        System.out.println("2. Exponentiation");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                root(sc);
                break;
            case 2:
                expo(sc);
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid operation");
        }
    }

    private static void root(Scanner sc) {
        System.out.println("Enter a number: ");
        double n = sc.nextDouble();
        if (n < 0) {
            System.out.println("Square root is not defined");
        } else {
            double r = Math.sqrt(n);
            System.out.println("Result: " + r);
        }
    }

    private static void expo(Scanner sc) {
        System.out.println("Enter two numbers:");
        double base = sc.nextDouble();
        double exponent = sc.nextDouble();

        double result = Math.pow(base, exponent);
        System.out.println("Result: " + result);
    }

    private static void UnitConverter(Scanner sc) {
        System.out.println("Select a conversion");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                cf(sc);
                break;
            case 2:
                fc(sc);
                break;
            default:
                System.out.println("Please Enter a valid operation");
        }
    }

    private static void cf(Scanner sc) {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "°C is " + fahrenheit + "°F.");

    }

    private static void fc(Scanner sc) {
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + "°F is " + celsius + "°C.");
    }
}