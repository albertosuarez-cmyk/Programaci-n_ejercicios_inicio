package unit2part2;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		//Create the scanner
		
		Scanner sc = new Scanner(System.in);
		
		//Create variable 
		
		int numero1;
		int numero2;
		int resto;
		int cantidadASumar;
		
		//Question the number
		
        System.out.print("Ingrese el primer número entero: ");
        numero1 = sc.nextInt();
      
        System.out.print("Ingrese el segundo número entero: ");
        numero2 = sc.nextInt();
        
        //Calculate
        
        resto =  numero1 % numero2;
        
        cantidadASumar = (resto == 0) ? 0 : numero2 - resto;
        
        //Calculate
        
        System.out.println("Para que " + numero1 + " sea multiplo de " + numero2 + " hay que sumarle: " + cantidadASumar);
	}

}