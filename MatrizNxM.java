/**
 * @author Jorge Luque
 * 
 * Programa que crea una matriz de N y M y muestra la multiplicación de los valores introducidos por teclado.
 */

import java.util.Scanner;

public class MatrizNxM {

	public static void main(String [] args) {
		
		Scanner entrada = new Scanner (System.in);
		int fila = 0, columna = 0;
		int [][] matriz;
		int valorN, valorM, resultadoNM;
		int contadorNegativos = 0, contadorPositivos = 0, contadorCeros = 0;
		
		try {
			
			//do while por si se mete un valor que no sea válido se le vuelva a pedir al usuario.
			do {
				System.out.print("Introduce el numero de filas que desea que tenga la matriz: ");
				fila = entrada.nextInt();
				System.out.println("");
				
				if (fila <= 0) {
					System.out.println("ERROR. El valor de las filas no puede ser 0 o menor que 0.");
					System.out.println("");
				}
				
				else {
					System.out.print("Introduce el numero de columnas que desea que tenga la matriz: ");
					columna = entrada.nextInt();
					System.out.println("");
					
					if(columna <= 0) {
						System.out.println("ERROR. El valor de las columnas no puede ser 0 o menor que 0.");
						System.out.println("");
					}
				}
			}while(fila <= 0 || columna <= 0);
			
			matriz = new int [fila][columna];	//Ahora que sabemos el valor de las filas y las columnas se lo damos a la matriz.
			
			//For para crear las filas
			for(int filas = 0; filas < fila; filas++ ) {
				
				//For para crear las columnas y para pedir los valores de cada posición.
				for(int columnas = 0; columnas < columna; columnas ++) {

					System.out.print("Introduce el valor N para la multiplicacion: ");
					valorN = entrada.nextInt();
					System.out.println("");
					
					System.out.print("Introduce el valor M para la multiplicacion: ");
					valorM = entrada.nextInt();
					System.out.println("");
					entrada.nextLine();
					
					resultadoNM = valorN * valorM;
					
					//Hacemos los contadores al final del for.
					if(resultadoNM < 0) {
						contadorNegativos++;
					}
					
					else if(resultadoNM > 0) {
						contadorPositivos++;
					}
					
					else {
						contadorCeros++;
					}
					
					//Le damos el valor de cada multiplicación en su posición.
					matriz [filas][columnas] = resultadoNM;
					
				}
			}
			
			//Mostramos los resultados.
			System.out.println("La matriz es: ");
			System.out.println("");

			for (int filas = 0; filas < fila; filas++) {
				for(int columnas = 0; columnas < columna; columnas++) {
					System.out.print(matriz [filas][columnas] + "\t");
				}
				System.out.println("");
			}
			
			System.out.println("");
			System.out.print("Valores menores a 0: " + contadorNegativos);
			System.out.println("");
			System.out.print("Valores mayores a 0: " + contadorPositivos);
			System.out.println("");
			System.out.print("Valores iguales a 0: " + contadorCeros);
		}
		//Excepciones
		catch(Exception e) {
			System.out.println("ERROR. Valor invalido");
		}
		
		//Cerramos el Scanner
		finally {
			entrada.close();
		}
		
	}
}