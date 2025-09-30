package unit2part2;

import java.util.Scanner;

public class Exercise09 {
	
	public static void main(String[] args) {
		
		//Creamos el escnaer
		
		Scanner sc = new Scanner(System.in);
		
		//Creamos las variables
		
		int numeroDado;
		double valor;
		
		//Preguntamos por el numero
		
		System.out.println("¿Cual es tu problema?");
		numeroDado = sc.nextInt();
		
		//Dividimos el numero por 100
		
		valor = (int) ((numeroDado / 100));
		
		//Enseñamos solo el valor entero
		
		System.out.println("Tu volumen es el " + (int) valor);
		
		
	}

}
