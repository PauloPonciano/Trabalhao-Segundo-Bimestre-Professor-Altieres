package trabalhosegundosemestre;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a,b;
		System.out.println("Digite um valor");
		a = sc.nextInt();
		System.out.println("Digite um valor");
		b = sc.nextInt();
		
		
		num(a, b);
		
	}
	public static void num(int a, int b){
		int r,q;
		if (b != 0){
			q = a/b;
			r=a%b;
			a=b;
			b=r;
			num(a, b);
		}else
		System.out.println(a);
		
	}
	
}
