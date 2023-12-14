/**
 * @author Jorge Luque
 * 
 * Programa que crea una matriz para mostrar las tablas de multiplicar hasta el 10
 */
public class MatrizTablas {
    
    public static void main(String[] args) {
        
        int[][] matriz = new int[10][10];	//Matriz

        // Rellenar la matriz con las tablas de multiplicar
        for (int fila = 0; fila < 10; fila++) {
        	
        	//En este bucle hasta que no se salga de él, columna no cambiará su valor es el número que usamos para las tablas
            for (int columna = 0; columna < 10; columna++) {
                matriz[fila][columna] = (fila + 1) * (columna + 1);
            }
        }

        // Mostrar la matriz por pantalla
        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println("");
        }
    }
}
