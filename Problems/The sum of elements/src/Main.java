import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;

        do {
            number = scanner.nextInt();
            if (number>0) sum+= number;
        } while (number!= 0);

        System.out.println(sum);
    }
}