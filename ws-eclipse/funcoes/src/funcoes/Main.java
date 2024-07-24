package funcoes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.printf("Maior : %d",maior(a, b, c));
		
		sc.close();
	}

	public static int maior(int x, int y, int z) {
		if (x > y && x > z)
			return x;
		else if (y > x && y > z)
			return y;
		else
			return z;
	}
	
}
