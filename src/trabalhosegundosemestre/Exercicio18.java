package trabalhosegundosemestre;

import java.util.Scanner;

//J = juros
//P = principal (capital)
//i = taxa de juros
//n = número de períodosxe
//Emplo: Temos uma dívida de R$ 1000,00 que deve ser paga com juros de 8% a.m. pelo regime de juros simples e devemos pagá-la em 2 meses. Os juros que pagarei serão:
//J = 1000 x 0.08 x 2 = 160
public class Exercicio18 {
	static Scanner sc = new Scanner(System.in);
	static double j = 0;
	public static void main(String[] args) {
		
		double p = 0;
		double i = 0;
		double n = 0;
		System.out.println("digite o valor");
		p = sc.nextDouble();
		System.out.println("valor do taxa de juros ");
		i = sc.nextDouble();
		System.out.println("Numeros de Parcelas");
		n = sc.nextDouble();
//		j=j+(p*i);
//		System.out.println(j);
		juros(j, p, i, n);
	}
	public static void juros (double j,double p,double i, double n){
		if(n > 0){
			j=j+(p*i);
			n--;
			juros(j, p, i, n);
			
		}else {
			System.out.println(j);
		}
		
		
	}
}
