package trabalhosegundosemestre;

import java.util.Scanner;

public class Exercicio03 {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
		int[] array = new int [10];
		int contador = 0;
		int soma = 0 ;
		valor(array, contador, soma);
	}
	public static void valor (int array[], int contador,int soma){
		if(contador <10){
			System.out.println("Digite Um valor");
			array[contador]=sc.nextInt();
			soma += array[contador];
			contador++;
			valor(array, contador, soma);
		}else {
			
			System.out.println(soma);
		}
		}
}
