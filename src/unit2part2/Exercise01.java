package unit2part2;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		
		//Create the Scanner
		
		Scanner sc = new Scanner(System.in);
		
		//Create the variables
		
		double numeroDecimal;
		int numeroEntero;
		
		//Question the number
		
		System.out.println("Escribe un numero en decimal");
		numeroDecimal = sc.nextDouble();
		
		//Calculate the number whit out decimal
		
		numeroEntero = (int) (numeroDecimal + 0.5);
		
		//Print the answer writing int to see only the complete number
		
	
		System.out.println("Rendondeando tu numero seria " + numeroEntero);
	}

}
