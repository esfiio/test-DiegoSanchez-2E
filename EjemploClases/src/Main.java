import java.util.Scanner;

//Calculadora POO
public class Main {
    public static void main(String[] args){

        Ticket ticket1 = new Ticket(); //instancia de una clase Ticket
        InputValidator inputValidator = new InputValidator();
        Scanner sc = new Scanner(System.in);
        //input
        int cantidad = inputValidator.obtenerNumeroEntero("Ingresa la cantidad de productos", sc);
        //process
        ticket1.procesar(cantidad);
        //output
        ticket1.imprimirTicket(cantidad);
    }
}