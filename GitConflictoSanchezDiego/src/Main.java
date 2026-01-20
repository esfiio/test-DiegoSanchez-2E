import java.util.Scanner;

public class Main {

    static double IVA = 0.16;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double subtotal = pedirDouble(scanner, "Subtotal: ");
        double total = calcularTotal(subtotal);

        System.out.printf("Total a pagar: %.2f%n", total);
    }

    public static double pedirDouble(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public static double calcularTotal(double subtotal){
        return subtotal + (subtotal * IVA);
    }
}