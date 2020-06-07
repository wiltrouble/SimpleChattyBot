import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String nameArray[] = new String[8];
        for (int i = 0; i < nameArray.length; i++) {
            String newName = s.next();
            nameArray[i] = newName;
        }

        for (int i = nameArray.length-1; i >= 0 ; i--) {
            System.out.print(nameArray[i] + "\n");
        }
    }
}