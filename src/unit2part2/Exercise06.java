package unit2part2;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		//Create Scanner
		
		Scanner sc = new Scanner(System.in);

		//Create the variables
		
		double milimetros;
		double centimetros;
		double metros;
		double totalCentimetros;
		
		//Question the variables
		
		System.out.println("Escriba una distancia en milimetros");
		milimetros = sc.nextDouble();
		
		System.out.println("Escriba una distancia en centimetros");
		centimetros = sc.nextDouble();
		
		System.out.println("Escriba una distancia en metros");
		metros = sc.nextDouble();	
		
		//Calculate
	
		milimetros = (milimetros / 10);
		metros = (metros * 100);
		
		totalCentimetros = (milimetros + centimetros + metros);
		
		System.out.println("La distancia total seria " + totalCentimetros + " centimetros");
	}

}
