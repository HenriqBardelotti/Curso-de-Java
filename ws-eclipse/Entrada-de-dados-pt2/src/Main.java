import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Leitura de uma frase até a quebra de linha nextLine
		String palavra = sc.nextLine();
		System.out.println(palavra);
		
		//Se for fazer uma leitura antes do nextLine, o nextLine le o enter, então precisaria fazer um nextLine() antes da leitura oficial, ex:
		
		int x = sc.nextInt();
		sc.nextLine(); //consome o enter da leitura do x
		String y = sc.nextLine();
		System.out.println(x);
		System.out.println(y);
		sc.close();
	}

}
