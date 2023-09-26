package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos si esta o no esta lloviendo
		boolean lluvia;
		
		// Variable donde guardaremos si ha terminado o no las tareas
		boolean tareas;
		
		// Variable donde guardaremos si tiene que ir o no a la biblioteca
		boolean biblioteca;
		
		// Variable donde guardaremos si puede salir o no
		boolean salir;
		
		// Le pedimos al usuario si esta lloviendo
		System.out.println("¿Está lloviendo?");
		lluvia = sc.nextBoolean();
		
		// Le pedimos al usuario si ha finalizado las tareas
		System.out.println("¿Has finalizado las tareas?");
		tareas = sc.nextBoolean();
		
		// Le pedimos al usuario si tiene que ir a la biblioteca
		System.out.println("¿Tienes que ir a la biblioteca?");
		biblioteca = sc.nextBoolean();
		
		// Comprobamos si puede ir a la biblioteca
		salir = (!lluvia && tareas) || biblioteca;
		
		// Mostramos si puede salir a la calle
		System.out.println("¿Puedes salir a la calle? --> " + salir);
		
		// Cerramos el scanner
		sc.close();
		

	}

}
