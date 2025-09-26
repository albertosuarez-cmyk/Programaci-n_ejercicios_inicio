package unit1;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {

		// Creamos el escaner

		Scanner sc = new Scanner(System.in);

		// Creamos la variable para comprobar si es mayor de edad.

		int edad;
		boolean mayoriaDeEdad;

		// Le realizamos la pregunta y escanearemos la respuesta

		System.out.println("Por favor introduzca tu edad");
		edad = sc.nextInt();
		mayoriaDeEdad = (edad >= 18);

		//Resultado
		
		if (mayoriaDeEdad) {
			System.out.println("Felicidades, eres mayor de edad");

		} else {
			System.out.println("No eres mayor de edad");

		}

	}

}
