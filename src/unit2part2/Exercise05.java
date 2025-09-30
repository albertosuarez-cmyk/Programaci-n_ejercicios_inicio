package unit2part2;

import java.util.Scanner;

public class Exercise05 {
	
	public static void main(String[] args) {
		
		//Create Scanner
		
		Scanner sc = new Scanner(System.in);
		
		//Create variables
		
		double segundos;
		double minutos;
		double  horas;
		
		System.out.println("Introduce una cantidad de segundos");
		segundos = sc.nextInt();
		
		minutos = (segundos / 60);
		horas = (segundos / 3600);
		
		System.out.println("En " + segundos + " segundos hay un total de " + minutos + " minutos y " + horas + " horas");
	}
}
