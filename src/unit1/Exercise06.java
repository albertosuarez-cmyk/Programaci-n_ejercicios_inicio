package unit1;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		//Creamos el escaner
		
		Scanner sc = new Scanner(System.in);
		
		//Creamos las variables con dobule porque pueden contener decimales
		
		double numero1;
		double numero2;
		
		//Pedimos los dos numero
		
		System.out.println("Escribe dos numeros");
		
		numero1 = sc.nextDouble();
		numero2 = sc.nextDouble();
		
		//Realizamos las operaciones
		
		System.out.println("La suma de estos numeros es:" + (numero1 + numero2));
		System.out.println("La resta de estos numeros es: " + (numero1 - numero2));
		System.out.println("La multiplicación de estos numeros es: " + (numero1 * numero2));
		System.out.println("La división de estos numeros es: " + (numero1 / numero2));
	}
}
