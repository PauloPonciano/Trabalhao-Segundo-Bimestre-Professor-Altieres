package trabalhosegundosemestre;

import java.util.Scanner;

public class Exercicio21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numero;
		System.out.println("Digite um valor");
		numero = sc.nextInt();
		
		System.out.println(triangulo(numero));
	}
	public static int triangulo(int numero){
		if (numero == 1){
			return numero;
		}else {
			return numero+triangulo(numero-1);
		}
	}
	
}
