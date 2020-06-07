import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number  = scanner.nextInt();
        int flag = 0;
        int flagTwo = 0;
        while (number > flagTwo) {
            flag++;
            flagTwo = flag * flag;
            if (flagTwo > number) {
                break;
            }
            System.out.println(flagTwo);
        }
    }
}