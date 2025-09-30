package unit2part2;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		
		//Creamos el escaner
		
		Scanner sc = new Scanner(System.in);
		
		//Create the varibales
		
		int año;
		double siglo;
		//Question the year
		
		System.out.println("¿Cual es el año?");
		año = sc.nextInt();
		
		//Calculate
		
		siglo = (int) ((año + 100) /100);

		//Answer the question
		
		System.out.println("El siglo de tu año es el " + (int) siglo);
	}

}
