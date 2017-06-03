package trabalhosegundosemestre;

public class Exercicio02 {

		public static void main(String[] args) {
			int contador = 100;
			
			
			imprime (contador);
			
		}
		public static void imprime (int contador){
			if (contador > 0){
				System.out.println(contador);
				contador--;
				imprime(contador);
			}else {
				System.out.println(contador);
			}
			
		}
	}
