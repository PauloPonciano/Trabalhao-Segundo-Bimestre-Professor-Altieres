package trabalhosegundosemestre;

import java.util.Scanner;

public class Exercicio05 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] array = new int[10];
		int contador = 0;
		int aux = 0;
		valor(array, contador, aux);
	}

	public static void valor(int array[], int contador, int aux) {
		if (contador < 10) {
			System.out.println("Digite um valor");
			array[contador] = sc.nextInt();
			if (array[contador] > aux){ 
				aux = array[contador];
			}
			contador++;
			valor(array, contador, aux);
		} else
			System.out.println(aux);
	}

}

