package entities;

public class Aluno {
	public String name;
	public double n1, n2, n3, media;
	
	public void calculoMedia() {
		this.media = n1 + n2 + n3;
	}
	
	public double pontosAprovar() {
		return 60 - media;
	}
}
