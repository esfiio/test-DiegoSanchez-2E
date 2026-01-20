import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("a: ");
        int a = s.nextInt();
        System.out.print("b: ");
        int b = s.nextInt();
        System.out.print("c: ");
        int c = s.nextInt();

        int r = a + b + c;
        System.out.println("suma=" + r);
        System.out.println("prom=" + (r / 3.0));
    }
}