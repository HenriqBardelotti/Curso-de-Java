package application;

import entities.Retangulo;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Enter with retangle width and height: ");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		System.out.printf("AREA: %.2f\n", retangulo.area());
		System.out.printf("PERIMETER: %.2f\n", retangulo.perimeter());
		System.out.printf("Diaonal: %.2f", retangulo.diagonal());
		
		sc.close();

	}

}
