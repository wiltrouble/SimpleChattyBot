import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight;
        int bridges;
        busHeight = scanner.nextInt();
        bridges = scanner.nextInt();
        int count = 0;
        ArrayList<Integer> heightBridge = new ArrayList<>();
        for (int i = 0; i < bridges; i++) {
            heightBridge.add(scanner.nextInt());
        }
        for (int i = 0; i < heightBridge.size(); i++) {
            if (heightBridge.get(i) <= busHeight) {
                System.out.println("Will crash on bridge " + (i+1));
                break;
            }
            count++;
        }
        if (count == bridges) {
            System.out.println("Will not crash");
        }
    }
}