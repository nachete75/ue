import java.util.Scanner;

public class While {


    public static void main(String[] args) {
      /*  System.out.println("Iniciar programa");
        int contador = 10;
        while (contador > 0) {
            System.out.println("Ejecucion dentro del while");
            contador--;
        }
        System.out.println("Saliendo del programa");
    }
}
*/
//DO WHILE
        int contador = 0;
        int numero;
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce un numero");
            numero = teclado.nextInt();
            if (numero != 0) {
                contador++;
            }
        } while (numero != 0);
        System.out.println("El número de numeros diferente a 0 ha sido:" + contador);
        System.out.println("Saliendo del programa");
    }
}