package trabalhosegundosemestre;

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int soma = 1;
		int valor = 0;
		System.out.println("Digite um valor");
		valor = sc.nextInt();
		fat(valor, soma);
	}
	
	public static void fat(int valor, int soma){
		if (valor > 0) {
		soma *= valor; 
		valor--;
		fat(valor, soma);
	}else
		System.out.println(soma);
}
}