package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables
		double kiloMan, kiloPera, totMan, totPera;
		final double precMan = 2.35, precPera = 1.95;
		
		
		// Le pedimos al usuario los kilos de manzanas y de peras
		System.out.println("Dime los kilos que has vendido de manzanas y de peras: ");
		kiloMan = sc.nextDouble();
		kiloPera = sc.nextDouble();
		
		// Calculamos los beneficios anuales
		totMan = (kiloMan * precMan);
		totPera = (kiloPera * precPera);
		
		// Mostramos los beneficios anuales
		System.out.println("En el año en manzanas has generado: " + totMan + "€ y de peras: " + totPera + "€");
		
		// Cerramos el scanner 
		sc.close();
	}

}
