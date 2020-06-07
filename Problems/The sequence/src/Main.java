import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sequence = scanner.nextInt();
        int number;
        ArrayList<Integer> ary = new ArrayList<Integer>();

        while (sequence > 0) {
            number = scanner.nextInt();
            if (number % 4 == 0) {
                ary.add(number);
            }
            sequence--;
        }
        Collections.sort(ary);
        System.out.println(ary.get(ary.size()-1));
    }
}