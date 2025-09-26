package unit1;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {

		// Creamos el escaner
		
		Scanner sc = new Scanner(System.in);
		
		//Creamos la variable
		
		double valorpesetas = 116;
		double euro = 1;
		double dinero;
		
		//Le preguntamos el total de pesetas y registramos el numero que coloque
		
		System.out.println("Coloca el total de pesetas");
		dinero = sc.nextInt();
		
		System.out.println("Tienes un total de " + ((dinero * euro) /valorpesetas) + " €");
			
		}
	}


