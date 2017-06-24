package trabalhosegundosemestre;

import java.util.Scanner;

//10) Crie um algoritmo que salva 25 números em uma matriz bidimensional utilizando recursividade.ok

public class Exercicio10 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] mat = new int[5][5];
		int contador = 0;
		matriz(mat, contador);
	}

	public static void matriz(int[][] mat, int contador) {

		int num = 0;
		if (contador < 5) {
			for (int i = 0; i < mat.length; i++) {

				System.out.println("Digite um valor");
				num = sc.nextInt();
				mat[contador][i] = num;

			}
			contador++;
			matriz(mat, contador);
		} else if (contador == 5) {
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat.length; j++) {

					System.out.print(mat[i][j] + ",");
				}
			}

		}

	}

}
