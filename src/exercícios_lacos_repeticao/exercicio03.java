package exercícios_lacos_repeticao;

import java.util.Scanner;

public class exercicio03 {
	
	/* Faça um programa que solicite um número inteiro ao usuário e, em seguida, 
	 * use um laço for para imprimir a tabuada desse número (de 1 a 10). */
	
	public static void main (String[] args) {
		
		int numero = obterNumero();
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(numero +"x"+ i +" é: "+ numero*i);
			
		}
		
	}
	
	
	public static int obterNumero() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número inteiro positivo: ");
		int numero = scanner.nextInt();
		return numero;
	}

}
