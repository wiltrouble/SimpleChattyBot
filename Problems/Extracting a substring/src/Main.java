import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.next();
        int start = s.nextInt();
        int end = s.nextInt();
        System.out.println(text.substring(start, end+1));
    }
}