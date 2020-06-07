import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String value;
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        myMap.put("0", 0);
        myMap.put("1", 0);
        myMap.put("-1", 0);
        for (int i = 0; i < size; i++) {
            value = scanner.next();
            myMap.put(value, myMap.get(value)+1);
        }

        System.out.println(myMap.get("0") + " " + myMap.get("1") + " " + myMap.get("-1"));
    }
}