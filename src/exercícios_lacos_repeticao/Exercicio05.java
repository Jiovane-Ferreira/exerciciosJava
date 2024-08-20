package exercícios_lacos_repeticao;
import java.util.Scanner;

/* Crie um programa que peça ao usuário para inserir 
 * um número inteiro positivo e, em seguida, 
 * use um laço while para calcular e exibir a 
 * soma de todos os dígitos desse número */


public class Exercicio05 {
	
	public static void main(String[] args) {
		
		int numero = numeroUsuario();
		int soma = 0;
		
		while (numero > 0) {
			
			int valor = (numero%10);
			soma = soma + valor;
			numero = (numero/10);
			
			
			
		}
		
		System.out.print("A somatória dos dígitos é: " +soma);
		
	}
	
	public static int numeroUsuario() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o teu número aqui: ");
		int numero = scanner.nextInt();
		return numero;
		
	}

}
