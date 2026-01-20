import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primerNumero= pedirEntero(scanner, "Ingresa el primer numero:");
        int segundoNumero= pedirEntero(scanner, "Ingresa el segundo numero:");
        int tercerNumero= pedirEntero(scanner, "Ingresa el tercer numero:");

        int suma= hacerSuma(primerNumero, segundoNumero, tercerNumero);
        System.out.println("La suma es: "+ suma);
        System.out.println("El promedio es: "+ hacerPromedio(suma));
    }

    /**
     * Metodo para pedir el numero al usuario
     * @param scanner -> declarado en el main
     * @param mensaje -> es un parametro
     * @return -> int el numero solicitado al usuario
     */

    public static int pedirEntero(Scanner scanner, String mensaje){
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    /**
     * metodo para hacer la suma
     * @param primerNumero -> el primer numero que ingresa el usuario
     * @param segundoNumero -> el segundo numero que ingresa el usuario
     * @param tercerNumero -> el tercer numero que ingresa el usuario
     * @return -> int de la suma de los 3 numeros
     */

    public static int hacerSuma(int primerNumero, int segundoNumero, int tercerNumero){
        return primerNumero+segundoNumero+tercerNumero;
    }

    /**
     * Metodo para hacer el promedio
     * @param suma -> usa la suma de los numero para despues dividirla entre 3
     * @return -> double de la division de la suma dividida entre 3
     */

    public static double hacerPromedio(int suma){
        return suma/3.0;
    }
}