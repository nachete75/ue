import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PracticaBingo1Trimestre {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Integer> bingoCard = crearCarton();
        System.out.println("Cartón de Bingo creado: " + bingoCard);

        System.out.print("Ingrese la cantidad de la apuesta: ");
        int apuesta = teclado.nextInt();

        System.out.print("Ingrese la cantidad de números para el bingo: ");
        int numerosBingo = teclado.nextInt();
        jugarBingo(bingoCard, numerosBingo, apuesta);
    }
    private static List<Integer> crearCarton() {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 99; i++) {
            numeros.add(i);
        }


    }
}