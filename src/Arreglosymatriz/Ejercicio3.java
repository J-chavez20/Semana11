package Arreglosymatriz;
import java.util.Random;
public class Ejercicio3 {
    public static void main(String[] args) {
        int[][] ventas = new int[4][4];
        int ventaMayor = Integer.MIN_VALUE, ventaMenor = Integer.MAX_VALUE;
        Random rand = new Random();

        // Generar ventas aleatorias y encontrar la mayor y menor
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ventas[i][j] = rand.nextInt(4991) + 10; // Números aleatorios entre 10 y 5000
                if (ventas[i][j] > ventaMayor) {
                    ventaMayor = ventas[i][j];
                }
                if (ventas[i][j] < ventaMenor) {
                    ventaMenor = ventas[i][j];
                }
            }
             }

        System.out.println("La venta mayor es: " + ventaMayor);
        System.out.println("La venta menor es: " + ventaMenor);
    }
}
