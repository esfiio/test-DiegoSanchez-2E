import java.util.Scanner;
import java.util.Random;

public class Main {
    public static int contadorAciertos;
    public static int contadorNoNumericos;

    public static void main(String[] arga){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maximo=50;
        int minimo=1;
        int numeroSecreto = random.nextInt(maximo)+minimo;
        boolean gano=false;

        for(int ronda = 1; ronda == 5; ronda++){


        }
    }

    public static int ontenerEntero(Scanner scanner, String mensaje){
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    public static int validarNumero(Scanner scanner, String mensaje){
        int valor;
        System.out.println(mensaje);
        if()

    }

}