package trabalhosegundosemestre;

import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[] args) {
		int sequencia = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantos numeros de pell quer gerar");
		sequencia = sc.nextInt();
		int contador = 0;
		pell(sequencia, contador);
	}
	static void pell(int sequencia, int contador){
		if(sequencia>contador){
			System.out.println(sequenciaPell(contador));
			contador++;
			pell(sequencia, contador);
		}
	}
	
	
	static int sequenciaPell(int valor){
		if (valor ==0 || valor ==1){
			return valor;
		}else{
			return 2*sequenciaPell(valor-1)+ sequenciaPell(valor-2); 
		}
	}
}
