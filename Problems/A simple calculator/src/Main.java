import java.util.Scanner;

class Main {
    public static long addition(long a, long b) {
        return a + b;
    }

    public static long subtraction(long a, long b) {
        return a - b;
    }

    public static long multiplication(long a, long b) {
        return a * b;
    }

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long numberOne = scanner.nextLong();
        String operator = scanner.next();
        long numberTwo = scanner.nextLong();
        switch (operator) {
            case "+":
                System.out.println(addition(numberOne, numberTwo));
                break;
            case "-":
                System.out.println(subtraction(numberOne, numberTwo));
                break;
            case "*":
                System.out.println(multiplication(numberOne, numberTwo));
                break;
            case "/":
                if (numberTwo == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(numberOne/numberTwo);
                }
                break;
            default:
                System.out.println("Unknown operator");
        }
    }
}