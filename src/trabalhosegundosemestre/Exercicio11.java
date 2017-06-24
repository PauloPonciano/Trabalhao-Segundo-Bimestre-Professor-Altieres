package trabalhosegundosemestre;

import java.util.Scanner;

public class Exercicio11 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[][][] mat = new int[5][5][5];
		int contador = 0;
		matriz(mat, contador);
	}

	public static void matriz(int[][][] mat, int contador) {

		int num = 0;
		if (contador < 5) {
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat.length; j++) {
					
					System.out.println("Digite um valor");
					num = sc.nextInt();
					mat[contador][i][j] = num;
				}

			}
			contador++;
			matriz(mat, contador);
		} else if (contador == 5) {
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat.length; j++) {
					for (int j2 = 0; j2 < mat.length; j2++) {
						System.out.print(mat[i][j][j2] + ",");
					}
					
				}
			}

		}

	}

}