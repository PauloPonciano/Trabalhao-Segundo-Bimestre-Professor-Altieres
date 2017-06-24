package trabalhosegundosemestre;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("digite a quantidade de discos?: ");
        int quantidade = sc.nextInt();

        comoMovimentar(quantidade, "inicio", "fim", "meio");
    }

    private static void comoMovimentar(int quantidade, String inicio, String meio, String fim) {
        if( quantidade > 0 ) {
        	comoMovimentar(quantidade-1, inicio, fim, meio);
            
            System.out.printf("%s de para %s\n", inicio, meio);
            
            comoMovimentar(quantidade-1, fim, meio, inicio);
        }
    }
}
