package unit1part1;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		
		//Creamos el escaner
		
		Scanner sc = new Scanner(System.in);
		
		//Creamos las variables, el nombre con String y la edad con int
		
		String nombre;
		int edad;
		
		System.out.println("Introduce tu nombre");
		
		nombre = sc.nextLine();
		
		System.out.println("Introduce tu edad");
		
		edad =  sc.nextInt();
		
		System.out.print("Hola " + nombre + ", tienes " + edad +  " años, ¡qué mayor eres!");
	}

}
