import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList<>();
        int number = scanner.nextInt();
        int flag = 1;
        while (values.size() < number) {
            for (int i = 0; i < flag; i++) {
                values.add(flag);
                System.out.println(flag + " ");
                if (values.size() == number) break;
            }
            flag++;
        }
        //System.out.println(values);
    }
}