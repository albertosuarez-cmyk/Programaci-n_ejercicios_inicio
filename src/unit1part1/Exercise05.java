package unit1part1;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		
		//Creamos el escaner
		
		Scanner sc = new Scanner(System.in);
		
		//Creamos la variable Radio
		
		double radio;
		
		//Le preguntamos el radio de la circunferencia y hacemos que el escaner lo lea
		
		System.out.println("¿Cual es el radio de la circunferencia?");
		
		radio = sc.nextDouble();
		
		//Realizamos el calculo matematico
		
		System.out.println("La longitud de la circunferencia es " + ( 2 * Math.PI * radio));
		System.out.println("El area de la circunferencia es " + ( Math.PI * radio*radio));
	}

}
