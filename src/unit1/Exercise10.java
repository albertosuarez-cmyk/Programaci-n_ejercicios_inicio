package unit1;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		
		//Creamos el escaner
		
		Scanner sc = new Scanner(System.in);
		
		//Creamos las variables
		
		int numero;
		boolean par;
		
		System.out.println("Introduce un numero");
		numero = sc.nextInt();
		par = (numero %2 == 0);
		
		if (par) {
			System.out.println("Tu numero es par");
			
		} else {
			System.out.println("Tu numero es impar");
		}
		
	}

}
