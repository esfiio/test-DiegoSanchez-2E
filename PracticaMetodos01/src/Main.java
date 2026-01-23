import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        // El Jefe manda a llamar a los empleados en orden
        double radio = pedirRadio();
        double area = calcularArea(radio);
        mostrarResultado(area);
    }

    // Método 1: Solo se encarga de interactuar con el teclado
    public static double pedirRadio() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el radio del círculo: ");
        return teclado.nextDouble();
    }

    // Método 2: Solo se encarga de la lógica matemática
    public static double calcularArea(double r) {
        // Fórmula: π * r²
        return Math.PI * Math.pow(r, 2);
    }

    // Método 3: Solo se encarga de imprimir
    public static void mostrarResultado(double resultado) {
        System.out.println("El área calculada es: " + resultado);
    }
}