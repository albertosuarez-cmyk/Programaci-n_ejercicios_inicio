package unit2part2;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		//Create the scanner
		
		Scanner sc = new Scanner(System.in);
		
		//Create variable 
		
		int numero;
		int resto;
		int cantidadASumar;
		
		//Question the number
		
        System.out.print("Ingrese un número entero: ");
        numero = sc.nextInt();
        
        //Divide the number in 7
        
        resto = numero % 7;
    
        //Calculate
        
        cantidadASumar = (resto == 0) ? 0 : 7 - resto;

        System.out.println("Para que " + numero + " sea múltiplo de 7, hay que sumarle: " + cantidadASumar);
	}

}
