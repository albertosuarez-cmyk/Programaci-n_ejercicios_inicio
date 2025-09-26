package unit1;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		
		//Creamos el escaner
		
		Scanner sc = new Scanner(System.in);
		
		//Creamos las variables
		
		double trimestre1;
		double trimestre2;
		double trimestre3;
		double notadecimal;
		int notacompleta;
		
		//Preguntamos las notas y las guardamos
		
		System.out.println("¿Cual es tu nota del primer trimetre?");
		trimestre1 = sc.nextDouble();
		
		System.out.println("¿Cual es tu nota del segundo trimetre?");
		trimestre2 = sc.nextDouble();
		
		System.out.println("¿Cual es tu nota del tercer trimetre?");
		trimestre3 = sc.nextDouble();
		
		//Calculamos las operaciones y 
		
		notadecimal = (trimestre1 + trimestre2 + trimestre3) /3;
		notacompleta = (int) notadecimal;
		
		System.out.println("Tu nota decimal es " + notadecimal);
		System.out.println("Tu nota compelta es " + notacompleta);
	}

}
