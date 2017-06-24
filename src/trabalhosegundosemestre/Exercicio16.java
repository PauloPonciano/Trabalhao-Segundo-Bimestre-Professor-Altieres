package trabalhosegundosemestre;

import java.util.Scanner;

public class Exercicio16 {
	private static int contador=0;

	public static void main(String[] args) {
		String[] nome = new String[10];

		nomes(nome);
		System.out.println();
		for (String string : nome) {
			System.out.print(string+", ");
		}
	}

	public static String[] nomes(String[] nome) {
		Scanner sc = new Scanner(System.in);
		String pessoa;
		if (contador <=9) {
			System.out.println("Digite o nome que deseja armazenar");
			pessoa = sc.nextLine();
			nome[contador] = pessoa;
			contador++;
			nomes(nome);
		}
		return nome;
	}
}
