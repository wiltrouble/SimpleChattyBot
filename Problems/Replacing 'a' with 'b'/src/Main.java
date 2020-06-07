import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.next();
        System.out.println(text.replace('a', 'b'));
    }
}