/**
 * @author Jorge Luque
 * 
 * Programa que registra sueldos de hombres y mujeres y detecta si existe brecha salarial
 */
import java.util.Scanner;

public class BrechaSalarial {
	
	public static void main(String [] args) {
		
		Scanner entrada = new Scanner(System.in);
		int Npersonas = 0, genero = 0, mujeres = 0, hombres = 0;
		double sumaSueldoM = 0, sumaSueldoH = 0, sueldoMedioM = 0, sueldoMedioH = 0;
		
		try {
			
			//Controlamos con el bucle que no se introduzca un valor negativo o un 0
			do {
				System.out.println("Introduzca el numero de personas que va a utilizar: ");
				Npersonas = entrada.nextInt();
				System.out.println("");
			
				if (Npersonas <= 0) {
					System.out.println("ERROR. El numero de personas no puede ser negativo o 0.");
					System.out.println("");
				}
			}while(Npersonas <= 0);
			
			//Matriz para el sueldo
			double [][] sueldo = new double [Npersonas][2];
			
			//for para introducir la información de cada persona
			for(int i = 0; i < Npersonas; i++) {
				
				System.out.println("Informacion para la persona " + (i + 1));
				System.out.println("");
				
				//Controlamos con el bucle que no se introduzcan valores fuera del rango
				do {
					System.out.print("Genero(0 Hombre) (1 Mujer): ");
					genero = entrada.nextInt();
					System.out.println("");

					if(genero != 0 && genero != 1) {
						System.out.println("ERROR. Introduzca solo 0 o 1");
						System.out.println("");
					}
				}while(genero != 0 && genero != 1);
				
				//Controlamos con el bucle que no se introduzcan sueldos negativos
				do {
					System.out.print("Introduzca su sueldo: ");
					sueldo[i][1] = entrada.nextDouble();
					System.out.println("");
					
					if (sueldo[i][1] <= 0) {
						System.out.println("ERROR. El sueldo no puede ser negativo o 0");
						System.out.println("");
					}
				}while(sueldo[i][1] <= 0);
				
				//Contador de mujeres y vamos sumando los sueldos para hacer el medio después
				if(genero == 1) {
					sumaSueldoM = sumaSueldoM + sueldo[i][1];
					mujeres++;
				}
				
				//Contador de hombres y vamos sumando los sueldos para hacer el medio después
				if(genero == 0) {
					sumaSueldoH = sumaSueldoH + sueldo[i][1];
					hombres++;
				}
			}
			//Calculamos los sueldos medios
			sueldoMedioM = sumaSueldoM / mujeres;
			sueldoMedioH = sumaSueldoH / hombres;
			
			//Mostramos los sueldos medios
			System.out.println("Sueldo medio de mujeres: " + sueldoMedioM);
			System.out.println("Suelo medio de hombres: " + sueldoMedioH);
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