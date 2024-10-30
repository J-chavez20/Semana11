package Arreglosymatriz;
import java.util.Random;
public class Ejercicio4 {
        public static void main(String[] args) {
        int[][] ventas = new int[3][3];
        int totalVentas = 0, promedioVentas = 0;
        int cantidadVentas = 9; // Total de elementos en la matriz
        Random random = new Random();

        // Generar ventas aleatorias y calcular el total y promedio
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ventas[i][j] = random.nextInt(9001) + 1000; // Números aleatorios entre 1000 y 10000
                totalVentas += ventas[i][j];
            }
        }

        promedioVentas = totalVentas / cantidadVentas;
        System.out.println("El total de las ventas es: " + totalVentas);
        System.out.println("El promedio de las ventas es: " + promedioVentas);
    }
}

