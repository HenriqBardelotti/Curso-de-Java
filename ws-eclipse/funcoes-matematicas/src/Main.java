import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		double x = sc.nextDouble();
		System.out.printf("Quadrado: %.2f \nRaiz: %.2f\nValor absoluto: %.2f", Math.pow(x, 2), Math.sqrt(x), Math.abs(x));
		sc.close();
	}

}
