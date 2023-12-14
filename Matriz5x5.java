/**
 * @author Jorge Luque
 * 
 * Programa que crea mediante un array bidimensional una matriz de 5x5 que muestra los números del 1 al 25
 */

public class Matriz5x5 {

    public static void main(String[] args) {
      
    	int[][] matriz = new int[5][5];		//Matriz
        int valorN = 1;	//Valor para los números

        // Una matriz para las filas
        for (int fila = 0; fila < 5; fila++) {
        	
        	//Matriz de las columnas dentro del bucle de las filas para guardar los valores en orden.
            for (int columna = 0; columna < 5; columna++) {
                matriz[fila][columna] = valorN;
                valorN++;
            }
        }

        // Mostrar la matriz por pantalla con el mismo método que el de arriba.
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print(matriz[fila][columna] + "\t");	//Ponemos el \t para tabular y que salga espaciada la matriz.
            }
            System.out.println("");  // Salto de línea al final de cada fila
        }
    }
}
