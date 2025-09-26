package unit1;

import java.util.Scanner;

public class Exercise13copia {

	public static void main(String[] args) {
		
		// Creamos el escaner
		
		Scanner sc = new Scanner(System.in);
		
		// Creamos las variables
		

		boolean lluevetrue;
		boolean tareatrue;
		boolean bibliotecatrue;
		String llueve;
		String tarea;
		String biblioteca;
		
		//Realizamos las preguntas y guardamos las respuestas dadas
		
		System.out.println("¿Fuera esta lloviendo? (si o no).");
		llueve = sc.next();
		
		System.out.println("¿Tienes tus tareas terminadas? (si o no).");
		tarea = sc.next();
		
		System.out.println("¿Tienes que ir a la biblioteca? (si o no).");
		biblioteca = sc.next(); 
		
		//Realizamos los calculos para las variables
		
		tareatrue = (tarea == "si");
		lluevetrue = (llueve == "si");
		bibliotecatrue = (biblioteca == "si");
		
		//Realizamos el comando para que determine si podemos salir o no
		
				if (bibliotecatrue) {
				System.out.println("Esta bien puedes salir");
		} else {
				if (tareatrue && lluevetrue == false){
			    System.out.println("Esta bien puedes salir");
			} else {
				System.out.println("No puedes salir");
			} 
		}
	}
}
		
		
	


