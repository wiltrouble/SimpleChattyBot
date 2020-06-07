import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        LinkedList<String> numbers = new LinkedList<String>();
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(number);
        while (m.find()) {
            numbers.add(m.group());
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}