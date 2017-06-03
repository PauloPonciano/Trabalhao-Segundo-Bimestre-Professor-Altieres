package trabalhosegundosemestre;

import java.util.Scanner;
import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class Exercicio07 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] array = new int[10];
		int[] par = new int[10];
		int contador = 0;
		int cont = 0;

		par(array, par, contador, cont);
	}

	public static void par(int[] array, int[] par, int contador, int cont) {
		if (contador < 10) {
			System.out.println("Digite um valor");
			array[contador] = sc.nextInt();
			if (array[contador]%2!=0) {
				par[cont] = array[contador];
				cont++;
			}
			contador++;
			par(array, par, contador, cont);
		} else {
			for (int i = 0; i < par.length; i++) {
				System.out.println(par[i]);
			}
		}

	}

}