package trabalhosegundosemestre;

import java.util.Scanner;

public class Exercicio17 {
	static Scanner sc = new Scanner(System.in);
	static int soma = 0;
	public static void main(String[] args) {
		int a;
		int b;

		System.out.println("Digite um valor");
		a = sc.nextInt();
		System.out.println("Digite um valor");
		b = sc.nextInt();
		int maior;
		int menor;
		if(a>b){
			maior = a;
			menor = b;
		}else{
			maior = b;
			menor = a;
		}
			
		mult(maior, menor);
	}

	public static void mult(int a, int b) {
		

			if (a> 0) {
				System.out.print("+"+b);
				a--;
				soma += b;
				mult(a, b);
		}else if(a==0){
			System.out.println(" = "+soma);
		}

	}
}
