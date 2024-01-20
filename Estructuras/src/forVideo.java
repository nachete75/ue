import java.util.Scanner;

public class forVideo {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       int acumulador = 0;
        for (int i = 0; i<10; i++){
    System.out.println("Por favor introduce un numero");
    int numero = teclado.nextInt();
    acumulador = acumulador+numero;
if (numero==0){
    break;
}
}
        for (int i = 0; i < 11; i++) {
            System.out.println("%d * %d = %d\n,1,i,1*i");

        }
        //System.out.println("Terminando bucle for");
        System.out.println("El valor de todos los numeros introducidos es:"
                + acumulador);}
}