import java.util.Scanner;

public class Problem1 {
    public double a;
    public double b;
    public String typeOfOperation;

    public Problem1(double a, double b, String typeOfOperation) {
        this.a = a;
        this.b = b;
        this.typeOfOperation = typeOfOperation;
    }

    public double calculateMethod() {
        switch (typeOfOperation.toLowerCase()) {
            case "add":
                return a + b;
            case "sub":
                return a - b;
            case "mul":
                return a * b;
            case "div":
                try{
                    return a/b;
                }
                catch(ArithmeticException e)
                {
                    System.out.println("value of b cannot be zero");
                }
            default:return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter the operation (add, sub, mul, div): ");
        String operation = sc.next();
        Problem1 cal1 = new Problem1(a, b, operation);
        try {
            System.out.println("Result: " + cal1.calculateMethod());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

