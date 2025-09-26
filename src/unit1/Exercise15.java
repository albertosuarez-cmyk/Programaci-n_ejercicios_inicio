package unit1;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		
		//Creamos el escaner
		
		Scanner sc = new Scanner(System.in);
		
		//Creamos las variables
		
		double iva = 1.21;
		double dinero;
		double dineroiva;
		
		//Preguntamos cuanto dinero cuesta
		
		System.out.println("¿Cual es el precio de tu producto?");
		dinero = sc.nextDouble();
		
		//Hacemos los calculos
		
		dineroiva = (dinero * iva);
		
		//Enseñamos el resultado
		
		System.out.println("Tu producto con iva cuesta " + dineroiva + " €");
	}

}
