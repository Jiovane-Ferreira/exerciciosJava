package exercícios_lacos_repeticao;

import java.util.Scanner;


public class exercicio04 {

	/* Escreva um programa que peça ao usuário um número inteiro positivo e, 
	 * em seguida, use um laço for para exibir uma contagem regressiva desse número até 0. */
	
	public static void main (String[] args) {
		
		int numero = obterNumero();
	
		
		for (int i = numero; i > 0; i-- ) {
			System.out.println(i);
		}
		
	}
	
	public static int obterNumero() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();
		return numero;
		
	}
	
	
	
}
