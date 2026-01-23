import java.util.Scanner;

public class ActividadIfElseTarifa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int edad = obtenerInt(sc, "Ingresa tu edad: ");
        boolean esEstudiante = obtenerBooleano(sc, "¿Eres estudiante? (responde con true o false): ");

        System.out.println("La edad del usuario es: " + edad);
        System.out.println("El usuario es estudiante: " + esEstudiante);
        System.out.println(obtenerTarifa(edad, esEstudiante));

    }

    public static int obtenerInt(Scanner sc, String mensaje) {
        System.out.println(mensaje);
        return sc.nextInt();
    }

    public static boolean obtenerBooleano(Scanner sc, String mensaje) {
        System.out.println(mensaje);
        return sc.nextBoolean();
    }

    public static String obtenerTarifa(int edad, boolean esEstudiante) {
        if (edad > 0 && edad < 120) {
            if (edad < 12) {
                return "La tarifa es de $50";
            } else if (edad > 12 && edad < 17) {
                if (esEstudiante) {
                    return "La tarifa es de $60";
                } else {
                    return "La tarifa es de $80";
                }
            } else if(edad>=18){
                if(esEstudiante){
                    return "La tarifa es de $90";
                } else{
                    return "La tarifa es de  $120";
                }
            }
        } else return "Edad invalida";
        return "";
    }
}