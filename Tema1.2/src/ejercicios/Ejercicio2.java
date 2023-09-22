package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables
		int edad;
		
		// Le pedimos al usuario que edad tiene
		System.out.println("Dime tu edad: ");
		edad = sc.nextInt();
		
		// Con el operador ternario ponemos si es mayor o menor de edad
		String mayorEdad = (edad >= 18)?"¡Eres mayor de edad!":"¡Eres menor de edad!";

		// Mostramos si es mayor o menor de edad
		System.out.println(mayorEdad);
		
		// Cerramos el scanner
		sc.close();
	}

}
