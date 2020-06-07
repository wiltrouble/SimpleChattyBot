import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        int mult = 1;
        long factorial = 1;
        while (factorial <= number) {
            mult++;
            factorial = factorial * mult;
        }

        System.out.println(mult);
    }
}