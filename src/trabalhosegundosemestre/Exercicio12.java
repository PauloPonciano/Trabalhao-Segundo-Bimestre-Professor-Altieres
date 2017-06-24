package trabalhosegundosemestre;

import java.util.Scanner;

public class Exercicio12 {
	static int soma;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num;
		int contador = 0;
		int ini = 1;
		
		
		System.out.println("De qual numero você deseja a tabuada ?");
		num = sc.nextInt();
		
		tamb(num, contador, ini);

	}

	public static int tamb(int num, int contador, int ini) {
		 if (contador < 10) {
			soma = num * ini++;
			System.out.println(soma);
			contador++;
			tamb(num, contador, ini);
		}
		return 0;
	}
}
