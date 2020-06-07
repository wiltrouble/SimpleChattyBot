import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;
         while ((number = scanner.nextInt()) !=0 ) {
             sum += number;
             if (sum >= 1000) {
                 sum = sum - 1000;
                 break;
             }
         }
        System.out.println(sum);
    }
}