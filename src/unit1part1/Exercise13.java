package unit1part1;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		
		// Creamos el escaner
		
		Scanner sc = new Scanner(System.in);
		
		// Creamos las variables
		

		boolean lluevetrue;
		boolean tareatrue;
		boolean bibliotecatrue;
		int llueve;
		int tarea;
		int biblioteca;
		
		//Realizamos las preguntas y guardamos las respuestas dadas
		
		System.out.println("¿Fuera esta lloviendo? (0 = Si. 1 = No).");
		llueve = sc.nextInt();
		
		System.out.println("¿Tienes tus tareas terminadas? (0 = Si. 1 = No).");
		tarea = sc.nextInt();
		
		System.out.println("¿Tienes que ir a la biblioteca? (0 = Si. 1 = No).");
		biblioteca = sc.nextInt(); 
		
		//Realizamos los calculos para las variables
		
		tareatrue = (tarea %2 == 0);
		lluevetrue = (llueve %2 == 0);
		bibliotecatrue = (biblioteca %2 == 0);
		
		//Realizamos el comando para que determine si podemos salir o no
		
				if (bibliotecatrue) {
				System.out.println("Esta bien puedes salir");
		} else {
				if (tareatrue && !lluevetrue){
			    System.out.println("Esta bien puedes salir");
			} else {
				System.out.println("No puedes salir");
			} 
		}
	}
}
		
		
	


