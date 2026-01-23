import java.util.Scanner;

public class ActividadSwitchCalculadora {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        imprimirMenu();
        int opcion= sc.nextInt();
        double variableA= obtenerDouble(sc, "Ingresa el primer numero de a operación");
        double variableB= obtenerDouble(sc,"Ingresa el segundo numero de la operación");
        double suma= variableA+variableB;
        System.out.println("La suma es:"+ suma);
    }

    /**
     * Metodo para obtener double -> Variables de las operaciones
     * @param sc -> declarado anteriormente en el main
     * @param mensaje -> parametro
     * @return -> double numeros a operar
     */
    public static double obtenerDouble(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextDouble();
    }

    public static void imprimirMenu(){
        System.out.println("-------Menú-------");
        System.out.println("Elige la operación que desees realizar:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
    }

    public static double hacerOperaciones(int sc, double variableA, double variableB){

    }
}
