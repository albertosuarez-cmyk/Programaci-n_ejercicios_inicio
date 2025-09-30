package unit2part2;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		
		//Create the Scanner
		
		Scanner sc = new Scanner(System.in);
		
		//Create variables
		
		int entradasInfantiles;
		double valorEntradasInfantiles;
		int entradasAdultas;
		double valorEntradasAdultas;
		double ventaTotal;
		
		//Question the type of tickets
		
		System.out.println("¿Cuantas entradas infantiles se han vendido? (Precio 15,50€)");
		entradasInfantiles = sc.nextInt();
		
		System.out.println("¿Cuantas entradas adultas se han vendido? (Precio 20€)");
		entradasAdultas = sc.nextInt();
		
		//Operations
		
		valorEntradasInfantiles = (entradasInfantiles * 15.5);
		valorEntradasAdultas = (entradasAdultas * 20);
		
		ventaTotal = (valorEntradasInfantiles + valorEntradasAdultas);	
		ventaTotal = (ventaTotal >= 100) ? (ventaTotal -(ventaTotal *0.05)) : ventaTotal;
		
		//Show the answer
		
		System.out.println("El precio total sera " + ventaTotal + (" €"));
	}

}
