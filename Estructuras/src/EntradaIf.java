
import java.util.Scanner;

public class EntradaIf {


    public static void main(String[] args) {
        int nota = 104523;
        System.out.println("Se está ejecutando el programa");
        //0 a 4.99 Suspenso 5 a 6.99 Aprobado 7 a 8.99 Notable 9 a 9.99 Sobresaliente 10 MH
        if (nota >= 1 && nota <= 10) {
            if (nota > 1 && nota < 5) {
                System.out.println("Has suspendido");
            } else if (nota >= 5 && nota < 6.99) {
                System.out.println("Tu nota es un aprobado");
            } else if (nota >= 7 && nota < 9) {
                System.out.println("Tu nota es notable");
            } else if (nota >= 9 && nota < 10) {
                System.out.println("Tu nota es sobresaliente");
            } else {
                System.out.println(" tu nota es matrícula de honor");
            }
        } else {
            System.out.println("La nota no es valida");
        }
    }
}
//Determinar un programa que establezca si el numero es par o impar
//Un nº es par si es divisible / 2, si el resto de dividir el numero es 0,nº es par,si no es impar
//El ejemplo de numero divisible entre dos y el if ternario por apuntes.

