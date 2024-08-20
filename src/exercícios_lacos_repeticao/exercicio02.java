package exercícios_lacos_repeticao;
import java.util.Scanner;

public class exercicio02 {

	public static void main (String[] args) {
		
		int numero = obterNumero();
		int cont = 1;
	
		while (cont <= numero) {
			
			if (cont%2 == 0) {
				System.out.println(cont);
			}
			
			cont ++;
			
		}
		
	}
	
	public static int obterNumero() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número inteiro positivo: ");
		int numero = scanner.nextInt();
		return numero;
	}
	
}
