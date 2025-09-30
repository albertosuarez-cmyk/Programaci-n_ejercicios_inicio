package unit2part2;

import java.util.Scanner;

public class Exerciose08 {

	public static void main(String[] args) {
		
		//Create the Scanner
		
		Scanner sc = new Scanner(System.in);
		
		//Create the variables
		
		double metros;
		double centimetros;
		
		//Question the distance
		
		System.out.println("Cuantos metros has recorrido)");
		metros = sc.nextDouble();
		
		centimetros = metros * 100;
		
		System.out.println("El recorrido es un total de " + (int) centimetros + " centimetros");
	}

}
