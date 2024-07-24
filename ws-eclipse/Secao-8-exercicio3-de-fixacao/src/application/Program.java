package application;

import entities.Aluno;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		aluno.name = sc.nextLine();
		System.out.print("N1: ");
		aluno.n1 = sc.nextDouble();
		System.out.print("N2: ");
		aluno.n2 = sc.nextDouble();
		System.out.print("N3: ");
		aluno.n3 = sc.nextDouble();
		
		aluno.calculoMedia();
		double media = aluno.media;
		
		if (media >= 60.0) {
			System.out.printf("FINAL GRADE: %.2f\nPASS", aluno.media);
		}
		else {
			System.out.printf("FINAL GRADE: %.2f\nFAILED\nMISSING %.2f POINTS", aluno.media, aluno.pontosAprovar());
		}
		
		sc.close();
	}

}
