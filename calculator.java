package calculator;

public class calculator {
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

        public static int multiply(int a,int b){
        return a*b;
    }

}
