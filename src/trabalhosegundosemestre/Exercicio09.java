package trabalhosegundosemestre;

import java.util.Scanner;

public class Exercicio09 {
	static Scanner sc = new Scanner(System.in);
	static int auxiliar;

	public static void main(String[] args) {
		int[] array = new int[10];
		int[] par = new int[10];
		int contador = 0;
		int cont = 0;
		Integer aux = Integer.MAX_VALUE;

		par(array, par, contador, cont, aux);
	}

	public static void par(int[] array, int[] par, int contador, int cont, Integer aux) {
		if (contador < 10) {
			System.out.println("Digite um valor");
			array[contador] = sc.nextInt();
			if (array[contador] % 2 == 0) {
				par[cont] = array[contador];
				cont++;
			}
			contador++;
			par(array, par, contador, cont, aux);
		} else {
			for (int i = 0; i < par.length; i++) {
				if (i < 9) {
					if (par[i] < par[i + 1]) {
						auxiliar = par[i];
						par[i] = par[i + 1];

					}
				}

			}

			for (int i = 0; i < par.length; i++) {
				System.out.println(par[i]);
			}
		}

	}
}