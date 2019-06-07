package model;

public class MULHERES{
	private double altura;
	private int idade;
	private double peso;
	
	public MULHERES(double altura, int idade, double peso) {
		this.altura = altura;
		this.idade = idade;
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void pesoIdealParaMulheres(double altura) {

		System.out.println("\n----------------- CÁLCULO DE PESO IDEAL PARA MULHERES -----------------");

		double pesoIdeal = ((altura*100) - 100) * 0.85;
		System.out.println("Seu peso Ideal é: " + pesoIdeal);
	}
	public void imcParaMulheresIdosas(int idade, double peso) {

		System.out.println(
				"----------------- CÁLCULO DE IMC BASEADO EM MULHERES COM IDADE ACIMA DE 65 ANOS -----------------------------");
		double imc = peso / Math.pow(altura, 2);

		System.out.println("Seu IMC é: " + imc);

		if (imc < 21.9) {
			System.out.println("Nível é: Baixo peso!");
		} else if (imc >= 22.0 && imc <= 27.0) {
			System.out.println("Nível é: Peso normal!");
		} else if (imc >= 27.1 && imc <= 32.0) {
			System.out.println("Nível é: Sobrepeso!");
		} else if (imc >= 32.1 && imc <= 37.0) {
			System.out.println("Nível é: Obesidade grau 1!");
		} else if (imc >= 37.1 && imc <= 41.9) {
			System.out.println("Nível é: Obesidade grau 2!");
		} else if (imc >= 42.0) {
			System.out.println("Nível é: Obesidade grau 3!");
		}
	}
}
