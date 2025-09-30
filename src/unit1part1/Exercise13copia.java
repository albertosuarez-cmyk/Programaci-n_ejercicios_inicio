package unit1part1;

import java.util.Scanner;

public class Exercise13copia {

	public static void main(String[] args) {
		
		// Creamos el escaner
		
		Scanner sc = new Scanner(System.in);
		
		// Creamos las variables
		

		boolean llueve;
		boolean tarea;
		boolean biblioteca;
	
		//  Variable para saber si puedo salir a la calle
		
		boolean salir;
		
		//Realizamos las preguntas y guardamos las respuestas dadas
		
		System.out.println("¿Fuera esta lloviendo?");
		llueve = sc.nextBoolean();
		
		System.out.println("¿Tienes tus tareas terminadas?");
		tarea = sc.nextBoolean();
		
		System.out.println("¿Tienes que ir a la biblioteca?");
		biblioteca = sc.nextBoolean(); 
		
		//Si no esta lloviendo y hemos finalizado nuestras tareas
		
		salir = (!llueve && tarea) || biblioteca;
		
		System.out.println("¿Puedes salir a la calle? " + salir);
	} 
		
	
}
		
		
	


