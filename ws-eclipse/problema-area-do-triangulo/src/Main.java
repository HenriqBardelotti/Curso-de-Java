import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double area1, area2;
		
		System.out.println("Triangulo X:");
		area1 = areaTriangulo(sc);
		
		System.out.println("Triangulo Y:");
		area2 = areaTriangulo(sc);
		
		System.out.printf("Area triangulo x = %.2f\nArea triangulo y = %.2f\n", area1, area2);
		if (area1 > area2)
			System.out.println("Area do triangulo X é maior");
		else
			System.out.println("Area do triangulo Y é maior");
		sc.close();

	}

	public static double areaTriangulo(Scanner sc){
		System.out.print("a: ");
		double a = sc.nextDouble();
		System.out.print("b: ");
		double b = sc.nextDouble();
		System.out.print("c: ");
		double c = sc.nextDouble();
		
		double p = (a+b+c)/2;
		
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
}
