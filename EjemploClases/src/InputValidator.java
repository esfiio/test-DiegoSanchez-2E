import java.util.Scanner;

public class InputValidator {

    public int obtenerNumeroEntero(String mensaje, Scanner sc){
        int valor;
        while(true){
            System.out.println(mensaje);
            if(sc.hasNextInt()){
                valor = sc.nextInt();
                if(valor>0){
                    return valor;
                }
                System.out.println("El numero ingresado no es valido");
            } else {
                System.out.println("El dato ingresado no es numerico(Solo se aceptan datos numericos)");
                sc.nextLine();
            }
        }
    }
}
