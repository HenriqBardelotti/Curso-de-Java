
public class Main {

	public static void main(String[] args) {
		//toLowerCase() passar para minúsculo
		//toUpperCase() passar para maiúsculo
		//trim() remover espaços, do início e do fim da string
		//substring(inicio) ou substring(inicio,fim) para recurtar string
		//replace(char,char) substituir caracter
		//replace(string,string) substituir string
		//indexOf buscar posição na string
		//lastIdexOf buscar posição na string
		//str.Split("") recorta a string com base em um sperador informado
		
		String original = "abcd FGHIJ ABC abc DEFG   ";
		
		System.out.println(original.toLowerCase());
		System.out.println(original.toUpperCase());
		System.out.println(original.trim()); // removeu os espaços do final
		System.out.println(original.substring(2)); //mostra os elementos a partir da posição 2 da string
		System.out.println(original.substring(2,8)); //8 indica a partir de que posição não vai pegar mais
		System.out.println(original.replace('a','x'));
		System.out.println(original.replace("abc", "xy"));
		System.out.println(original.indexOf("bc")); //mostra a primeira posição que aparece o argumento
		System.out.println(original.lastIndexOf("bc")); //mostra a ultima posição que aparece o argumento
		
		String s = "potato apple lemon";
		String[] vet = s.split(" ");
		for (int i = 0; i < 3; i++)
			System.out.println(vet[i]);
	}

}
