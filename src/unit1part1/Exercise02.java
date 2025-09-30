package unit1part1;
 
import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
	
		//Creamos el escaner
		
		Scanner sc = new Scanner(System.in);
		
		//Creamos la variable edad
		
		int edad;
		
		//Preguntamos la edad 
		
		System.out.println("Cual es tu edad");

		//Leemos la edad puesta
		
		edad = sc.nextInt();
		
		//Le sumamos uno a la edad puesta
		System.out.println("Dentro de un año tendras " + (edad + 1) + " años");
	}

}
