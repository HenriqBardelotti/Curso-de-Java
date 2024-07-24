import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// (condição) ? valor_se_verdadeiro : valor_se_falso;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int x = sc.nextInt();
		String y = (x < 10) ? "Menor que 10" : "Maior ou igual a 10";
		System.out.println(y);
		sc.close();
		
	}

}
