package trabalhosegundosemestre;

public class Exercicio22 {
	static int sequencia = 0;
	static int soma = 0;
	public static void main(String[] args) {

		int primeiro =0;
		int segundo = 1;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		fibo(primeiro, segundo);
		
	}
	public static int fibo(int primeiro,int segundo){
	if(sequencia < 45){	soma = primeiro+segundo;
		System.out.println(soma);
		sequencia++;
		return fibo(segundo, soma);
		}
	return 0;
	}

}
