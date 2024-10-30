package Arreglosymatriz;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int[][] compras = new int[4][4];
        int totalCompras = 0, promedioCompras = 0;
        int cantidadCompras = 16; // Total de elementos en la matriz

        System.out.println("Ingrese las compras:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Compra [" + (i+1) + "][" + (j+1) + "]: ");
                compras[i][j] = lectura.nextInt();
                totalCompras += compras[i][j];
            }
        }

        promedioCompras = totalCompras / cantidadCompras;
        System.out.println("El total de las compras es: " + totalCompras);
        System.out.println("El promedio de las compras es: " + promedioCompras);
    }
}
