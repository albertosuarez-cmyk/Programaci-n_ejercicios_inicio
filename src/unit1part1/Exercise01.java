package unit1part1;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		//Creamos el escaner
	
		Scanner sc = new Scanner (System.in);
		
		//Creamos la variable numero
		
		int numero;
		
		//Le pedimos el numeno
		
		System.out.print("Pon un número");
		
		numero = sc.nextInt();
		
		System.out.print("Tu numero es:" + numero);
	}

}
