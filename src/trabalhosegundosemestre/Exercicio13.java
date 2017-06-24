package trabalhosegundosemestre;

import java.util.Scanner;

public class Exercicio13 {
	static double soma = 0;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int contador = 0;
		calcula(contador);
	}

	public static void calcula(int contador) {
		System.out.println("Digite uma nota");
		double nota = sc.nextDouble();
		if (contador < 9) {
			soma += nota;
			contador++;
			calcula(contador);
		}else
		System.out.println(soma / 10);
	}
}
