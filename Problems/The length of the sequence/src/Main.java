import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (scanner.nextInt() != 0) {
            count++;
        }
        System.out.println(count);
    }
}