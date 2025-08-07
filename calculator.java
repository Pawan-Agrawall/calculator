
public class calculator {
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        
        System.out.println("Division: 1" );
        System.out.println("Multiplication: 2");
        System.out.println("Subtraction: 3");
        while(true){
            System.out.println("Enter your choice: ");
            int choice = new java.util.Scanner(System.in).nextInt();
            System.out.println("Enter first number: ");
            int num1 = new java.util.Scanner(System.in).nextInt();
            System.out.println("Enter second number: ");
            int num2 = new java.util.Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Result: " + calculator.divide((double)num1, (double)num2));
                    break;
                case 2:
                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case 4:
                    System.out.println("Result: " + add(num1, num2));;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

