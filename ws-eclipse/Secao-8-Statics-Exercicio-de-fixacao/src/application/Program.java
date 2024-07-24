package application;

import util.CurrencyConverter;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price?: ");
		double priceDollar = sc.nextDouble();
		System.out.print("How many dollars wil be bought?: ");
		double quantDollar = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f", 
				CurrencyConverter.convercao(priceDollar, quantDollar));
		
		sc.close();
	}

}
