package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Creamos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el número que se introduzca
		int num;
		
		// Variable booleana para mostrar true o false
		boolean esPar;
		
		// Le pedimos al usuario un número
		System.out.println("Dime un número: ");
		num = sc.nextInt();
		
		// Compramos si el numero es par
		esPar = (num % 2 == 0);
		
		// Mostramos si es par o no
		System.out.println("¿El número " + num + " es par? --> " + esPar);
		
		// Cerramos el scanner
		sc.close();
		    
	}

}
