import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String room = scanner.nextLine();

        double a;
        double b;
        double c;
        double p;
        double r;
        double square;

        switch (room){
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                p = (a + b + c) / 2;
                square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(square);
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                square = a * b;
                System.out.println(square);
                break;
            case "circle":
                r = scanner.nextDouble();
                square = 3.14 * r * r;
                System.out.println(square);
                break;
        }
    }
}