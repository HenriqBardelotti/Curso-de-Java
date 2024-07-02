import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.println("Olá Mundo"); //Acrescenta a quebra de linha automaticamente
		System.out.print("Olá Mundo"); //Printa sem a quebra de linha
		
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f %n", x); //printf é print formatado - %n é quebra de linha
		Locale.setDefault(Locale.US); //Configura a localição do programação - precisa do import java.util.Locale;
		System.out.printf("%.2f %n", x); 
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f METROS", x);
	}

}
