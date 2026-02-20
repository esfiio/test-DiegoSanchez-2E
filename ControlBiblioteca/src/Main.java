import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(true){


            int contadorRegistros = 0;
            int totalPermitidos = 0;
            int totalDenegados = 0;
            int porcentajePermitidos = 0;

            String codigo;
            System.out.println("Ingresa tu codigo");
            codigo = scanner.nextLine();
            if(codigo.equals("salir || SALIR")){
                break;
            }else{
                contadorRegistros +=1;
            }


            System.out.println("Escribe 'true' si eres alumno, sino escribe 'false': ");
            if(!scanner.hasNextBoolean()){
                System.out.println("Tipo de dato invalido");
                return;
            }

            boolean usuario= scanner.nextBoolean();
            System.out.println("Ingresa tu hora de entrada (0 - 23)");
            int hora;
            if(scanner.hasNextInt()){
                hora = scanner.nextInt();
                if(hora >= 0 && hora <= 23){
                    if (hora >= 21){
                        System.out.println("Biblioteca cerrada");
                        break;
                    }
                }else {
                    System.out.println("hora invalida");
                    return;
                }
            }else {
                System.out.println("Hora invalida");
                return;
            }

            if(eshorarioPermitido(hora, usuario)){


            }

        }

    }


    public static boolean  codigoValido(String codigo){
        if((codigo.length() != 6) || !codigo.matches("[a-zA-Z0-9]+")){
            return false;
        }
        return true;
    }

    public static boolean eshorarioPermitido(int hora, boolean usuario){
        if(usuario){
            if(hora>= 8 && hora <= 20){
                return true;
            } return false;
        }if (hora >= 10 && hora <= 18){
            return true;
        } return false;
   }

}
