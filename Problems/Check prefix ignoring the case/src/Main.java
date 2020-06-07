import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.next();
        System.out.println(startWithJ(text));
    }

    static boolean startWithJ(String text) {
        return text.toLowerCase().contains("j");
    }
}