import java.util.Scanner;

public class Main {

    static double IVA = 0.16;
    static double DESCUENTO = 0.10;
    static double UMBRAL_DESCUENTO = 1000.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double subtotal = pedirDouble(scanner, "Subtotal: ");
        double total = calcularTotal(subtotal);

        System.out.printf("Total a pagar con IVA: %.2f%n", total);
        System.out.println(calcularDescuento(subtotal,UMBRAL_DESCUENTO,total));
    }

    public static double pedirDouble(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public static double calcularTotal(double subtotal){
        return subtotal + (subtotal * IVA);
    }


    public static double calcularDescuento(double subtotal, double UMBRAL_DESCUENTO, double total) {
        if (subtotal > UMBRAL_DESCUENTO) {
            total = total - (total * DESCUENTO);
            System.out.println("El total con descuento es: ");
        } else
            System.out.println("No se aplica descuento, no has alcanzado el umbral de descuento");
        return total;
    }
}
