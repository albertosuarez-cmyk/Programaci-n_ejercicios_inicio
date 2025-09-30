package unit2part2;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		//Create the Scanner
		
		Scanner sc = new Scanner(System.in);
		
		//Create the variables
		
		int a;
		int b;
		int c;
		int x;
		int y;
		
		//Question the variables
		
		System.out.println("¿Cual es el valor de a?");
		a = sc.nextInt();
		
		System.out.println("¿Cual es el valor de b?");
		b = sc.nextInt();
		
		System.out.println("¿Cual es el valor de c?");
		c = sc.nextInt();
		
		System.out.println("¿Cual es el valor de x?");
		x = sc.nextInt();
		
		//Calculate
		
		y = (int) ((a * Math.pow(x, 2)) + (b * x) + (c));
		
		//Show the answer
		
		System.out.print("El valor de Y es " + y);
	}

}
