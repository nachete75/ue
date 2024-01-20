import java.util.Scanner;

public class DoWhileMenu {


    public static void main(String[] args) {
        System.out.println("Iniciar programa");
        Scanner teclado = new Scanner(System.in);//Crea la clase Teclado
        int numero;
        int contador = 0;
        int opcion = 0;
        do {
            System.out.println("Las opciones disponibles son");
            System.out.println("1-Opcion 1");
            System.out.println("2-Opcion 2");
            System.out.println("3-Opcion 3");
            System.out.println("4-Opcion 4");
            System.out.println("5-Salir");
            System.out.println("1-Qué opción quieres hacer");
            opcion = teclado.nextInt();//Lee la variable opcion

            switch (opcion) {
                case 1:
                    break;

                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }

        }while (opcion!=5);
        System.out.println("Terminando la ejecucion");


    }
}