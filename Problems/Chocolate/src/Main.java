import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m, k;
        n = scanner.nextInt();
        m = scanner.nextInt();
        k = scanner.nextInt();
        final String YES = "YES";
        final String NO = "NO";
        if (k <= n *m) {
            if (k % n == 0) {
                System.out.println(YES);
            } else if (k % m == 0) {
                System.out.println(YES);
            } else {
                System.out.println(NO);
            }
        } else {
            System.out.println(NO);
        }
    }
}