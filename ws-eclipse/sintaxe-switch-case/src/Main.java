import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe um numero: ");
		int x = sc.nextInt();
		switch (x) {
		case 1:
			System.out.println("Digitou 1");
			break;
		case 2:
			System.out.println("Digitou 2");
			break;
		case 3:
			System.out.println("Digitou 3");
			break;
		default:
			System.out.println("Numero maior que 3");
			break;
		}
		sc.close();
	}
}
