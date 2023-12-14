/**
 * @author Jorge Luque
 * 
 * Programa que guarda 5 notas de 4 alumnos y al final muestra las notas de cada uno.
 */

import java.util.Scanner;

public class NotasAlumnos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double[][] alumnoNota = new double[4][5];	//Array para cada alumno y cada asignatura
        int asignatura, alumno; 
        double nota = 0.0, notaMenor = 20.0, notaMayor = 0.0, notaMedia = 0.0, sumaNotas = 0.0;
        
        try {
        	//For para cada alumno
            for (alumno = 0; alumno < 4; alumno++) {
                System.out.println("Notas de alumno " + (alumno + 1));
                System.out.println("");

                sumaNotas = 0;  // Reiniciar la suma de notas para cada nuevo alumno

                //For para cada asignatura del alumno
                for (asignatura = 0; asignatura < 5; asignatura++) {
                    
                	//Bucle para controlar números fuera de rango
                	do {
                        System.out.print("Introduce la nota de la asignatura " + (asignatura + 1 )+ ": ");
                        nota = entrada.nextDouble();
                        System.out.println("");

                        alumnoNota[alumno][asignatura] = nota;

                        if (nota < 0.0 || nota > 10.0) {
                            System.out.print("ERROR. La nota no puede ser negativa o mayor de 10.");
                            System.out.println("");
                            System.out.println("");
                        }
                    } while (nota < 0.0);
                    
                    //Nota mas baja
                    if (nota < notaMenor) {
                        notaMenor = nota;
                    }
                    //Nota mas alta
                    if (nota > notaMayor) {
                        notaMayor = nota;
                    }
                    
                    sumaNotas = sumaNotas + nota;
                }

                // Calcular la nota media después de todas las asignaturas para el alumno actual.
                notaMedia = sumaNotas / 5;

                // Mostrar resultados para cada alumno
                System.out.println("Nota mas alta para el alumno " + alumno + ": " + notaMayor);
                System.out.println("Nota mas baja para el alumno " + alumno + ": " + notaMenor);
                System.out.println("Nota media para el alumno " + alumno + ": " + notaMedia);
                System.out.println("");  // Separador entre alumnos
            }
          //Excepciones
        } catch (Exception e) {
            System.out.println("ERROR. Valor invalido");
        }
        //Cerramos el Scanner
        finally {
        	entrada.close();
        }
    }
}