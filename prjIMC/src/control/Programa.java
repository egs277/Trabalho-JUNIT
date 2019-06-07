package control;

import java.util.Scanner;
import model.Feminino;
import model.HOMENS;
import model.MULHERES;
import model.Masculino;

public class Programa {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("\n----------------- CÁLCULO DE IMC ---------------\n");

		System.out.print("Idade: ");
		int idade = leia.nextInt();
		System.out.print("Sexo: ");
		String sexo = leia.next();
		System.out.print("Altura: ");
		double altura = leia.nextDouble();
		System.out.print("Peso: ");
		double peso = leia.nextDouble();

		if (idade > 19 && idade < 66) {
			System.out.println(
					"----------------- CÁLCULO DE IMC BASEADO EM ADULTOS ENTRE 20 E 65 ANOS -----------------------------");
			double imc = (peso / (altura * altura));

			System.out.println("Seu IMC atual é: " + imc);

			if (imc < 16.0) {
				System.out.println("Seu nível é: Baixo peso muito grave!");
			} else if (imc >= 16.0 && imc < 17.0) {
				System.out.println("Seu nível é: Baixo peso grave!");
			} else if (imc >= 17.0 && imc < 18.5) {
				System.out.println("Seu nível é: Baixo peso!");
			} else if (imc >= 18.5 && imc < 25.0) {
				System.out.println("Seu nível é: Peso normal!");
			} else if (imc >= 25.0 && imc < 30.0) {
				System.out.println("Seu nível é: Sobrepeso!");
			} else if (imc >= 30.0 && imc < 35.0) {
				System.out.println("Seu nível é: Obesidade grau 1!");
			} else if (imc >= 35.0 && imc < 40.0) {
				System.out.println("Seu nível é: Obesidade grau 2!");
			} else if (imc >= 40.0) {
				System.out.println("Seu nível é: Obesidade grau 3!");
			}
		}
		MULHERES feminino = new MULHERES(altura, idade, peso);
		HOMENS masculino = new HOMENS(altura, idade, peso);

		if (sexo.compareToIgnoreCase("Masculino") == 0) {
			masculino.pesoIdealParaHomens(altura);
		} else if (sexo.compareToIgnoreCase("Feminino") == 0) {
			feminino.pesoIdealParaMulheres(altura);
		}
		// ----------------------- MÉTODO PARA IMC DE MULHERES IDOSAS
		// --------------------
		if (idade > 65 && sexo.compareToIgnoreCase("Feminino") == 0) {
			feminino.imcParaMulheresIdosas(idade, peso);
		}

		// ----------------------- MÉTODO PARA IMC DE HOMENS IDOSOS
		// ----------------------
		if (idade > 65 && sexo.compareToIgnoreCase("Masculino") == 0) {
			masculino.imcIdealParaHomensIdosos(idade, peso);
		}

	}
}