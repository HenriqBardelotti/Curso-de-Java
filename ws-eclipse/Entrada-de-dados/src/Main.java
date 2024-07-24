import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String x = sc.next();
		
		System.out.print("Informe a sua idade: ");
		int idade = sc.nextInt();
		
		System.out.print("Informe a sua altura: ");
		double altura = sc.nextDouble();
		
		System.out.println("Nome: " + x);
		System.out.printf("Idade: %d\n", idade); //imprime com a virgula
		System.out.printf("Altura: %.2f%n", altura);
		System.out.println("Altura: " + altura); //println pega localidade independente
		Locale.setDefault(Locale.US); //Muda para o padrão americano <precisa importar o locale>, se importar a localidade antes de scanear, precisa digitar com .
		System.out.printf("Altura: %.2f", altura); //imprimo com o ponto
		sc.close();
		
	}

}
