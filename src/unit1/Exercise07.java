package unit1;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		
		// Creamos el escaner
		
		Scanner sc = new Scanner (System.in);
		
		// Creamos las variables
		
		String nombre;
		String dirección;
		String telefono;
		 
		// Introducir el nombre
		
		System.out.println("Por favor introduzca su nombre");
		nombre = sc.nextLine();
		
		// Introducir la dirección
		
		System.out.println("Por favor introduzca su dirección");
		dirección = sc.nextLine();
		
		// Introducir el telefono
		
		System.out.println("Por favor introduzca su numero de telefono");
		telefono = sc.nextLine();
		
		// Resultado
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + dirección);
		System.out.println("Nombre: " + telefono);
	}

}
