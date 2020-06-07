import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println(number);
        //System.out.println(isSymetric(Integer.parseInt(number)));
        if (isSymetric(Integer.parseInt(scanner.next()))) {
            System.out.println("1");
        } else {
            System.out.println("37");
        }
    }

    static boolean isSymetric(int number) {
        String val = String.valueOf(number);
        StringBuilder sb = new StringBuilder(val);
        return (val.equals(sb.reverse().toString()));
    }
}