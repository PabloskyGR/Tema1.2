package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos la nota del primer trimestre
		int nota1;
		
		// Variable donde guardaremos la nota del segundo trimestre
		int nota2;
		
		// Variable donde guardaremos la nota del tercer trimestre
		int nota3;
		
		// Varibale donde guardaremos la media entera
		int med;
		
		// Variable donde guardaremos la media con decimales
		float med2;
		
		// Le pedimos al usuario las notas de los 3 trimestres
		System.out.println("Dime las notas de los 3 trimestres: ");
		nota1 = sc.nextInt();
		nota2 = sc.nextInt();
		nota3 = sc.nextInt();
		
		// Calculamos la media entera
		med = (nota1 + nota2 + nota3) / 3;
		
		// Calculamos la media con decimales
		med2 = (float)(nota1 + nota2 + nota3) / 3;
		
		// Mostramos las notas medias
		System.out.println("En el boletín de calificaciones tienes un: " + med);
		System.out.println("En el expediente académico tienes un: " + Math.round(med2 * 100d) / 100d);
		
		// Cerramos el scanner
		sc.close();
		
	}

}
