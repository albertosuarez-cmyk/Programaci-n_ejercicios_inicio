package unit1part1;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		// Creamos el escaner
		
		Scanner sc = new Scanner(System.in);
		
		//Creamos las variables
		
		int añoActual;
		int añoNacimiento;
		
		//Le preguntamos en que año estamos y hacemos que el escarer detecte la respuesta
		
		System.out.println("¿En que año estamos?");
		
		añoActual = sc.nextInt();
		
		//Le preguntamos en que año nació y hacemos que el escaner detecte la respuesta
		
		System.out.println("¿En que año naciste?");
		
		añoNacimiento = sc.nextInt();
	
		//Restamos el año actual con su año de nacimiento y nos da su edad
		
		System.out.print("Tienes o vas a cumplir este año " + (añoActual - añoNacimiento));
		System.out.print(" años");
	}
}

