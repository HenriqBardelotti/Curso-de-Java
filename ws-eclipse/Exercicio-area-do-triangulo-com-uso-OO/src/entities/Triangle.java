package entities; //pacote da classe

public class Triangle { //nome da classe
	public double a;  //public indica que pode ser acessado de outro arquivo
	public double b; //atributos da classe
	public double c;
	
	public double area() {
		double p = (a+b+c)/2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
	
}
