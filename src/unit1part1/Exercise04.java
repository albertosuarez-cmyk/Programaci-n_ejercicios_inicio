package unit1part1;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		// Creamos el escaner
		
		Scanner sc = new Scanner (System.in);
		
		//Creamos las variables en double porque podriamos tener decimales
		
		double nota1;
		double nota2;
		
		//Preguntamos sobre sus notas y hacemos que el escaner las detecte
		
		System.out.println("¿Cuales han sido tus notas? Ponga primero la nota 1 y despues la nota 2");
		
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		
		//Realizamos la operación de la nota media sumando ambas notas y dividiendolas entre 2
		
		System.out.println("Tu nota media es de " + ((nota1 + nota2)/2));
		
	}

}
