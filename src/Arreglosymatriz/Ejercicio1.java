
package Arreglosymatriz;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int[][] ventas = new int[4][4];
        int totalVentas = 0;

        System.out.println("Ingrese las ventas:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Venta [" + (i+1) + "][" + (j+1) + "]: ");
                ventas[i][j] = lectura.nextInt();
                totalVentas += ventas[i][j];
            }
        }

        System.out.println("El total de las ventas es: " + totalVentas);
    }
}
