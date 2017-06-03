package trabalhosegundosemestre;

public class Exercicio01 {
	public static void main(String[] args) {
		int contador = 0;
		
		
		imprime (contador);
		
	}
	public static void imprime (int contador){
		if (contador < 100){
			System.out.println(contador);
			contador++;
			imprime(contador);
		}else {
			System.out.println(contador);
		}
		
	}
}
