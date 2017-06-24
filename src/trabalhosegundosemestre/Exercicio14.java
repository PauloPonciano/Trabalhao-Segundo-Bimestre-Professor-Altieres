package trabalhosegundosemestre;

import java.util.Scanner;

public class Exercicio14 {
	static int soma = 0;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int contador = 0;
		calcula(contador);
	}

	public static void calcula(int contador) {
		System.out.println("Digite a falta");
		int falta = sc.nextInt();
		if (contador < 9) {
			soma += falta;
			contador++;
			calcula(contador);
		}else
		System.out.println(soma / 10);
	}
}
