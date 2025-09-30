package unit1part1;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		
		// Generamos el escaner
		
		Scanner sc = new Scanner(System.in);
		
		//Creamos las variables
		
		double totalmanzanas;
		double totalperas;
		double dineroganadomanzanas;
		double dineroganadoperas;
		
		//Preguntamos cuantas kilos de peras y manzanas ha vendido y registramos el total
		
		System.out.println("¿Cuantos kilos de manzanas ha vendido?");
		totalmanzanas = sc.nextDouble();
		
		System.out.println("Cuantos kilos de peras ha vendido?");
		totalperas = sc.nextDouble();
		
		//Realizamos los calculos
		
		dineroganadomanzanas = (totalmanzanas * 2.35);
		dineroganadoperas = (totalperas * 1.95);
		System.out.println("Ha ganado un total de " + dineroganadomanzanas + " € vendiendo manzanas");
		System.out.println("Ha ganado un total de " + dineroganadoperas + " € vendiendo peras");
	}

}
