package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Aula 2 - Desenvolvimento JAVA - 08/05/2023 - SENAI
		// Declaração scanner
	
		Scanner leia = new Scanner(System.in); // abrindo a instância Scanner
		//Classe scanner - importando da biblioteca Java
		//crtl+shift+o - importa todas as classes que nessecitam de importação.
		
/*		
		int idade;
		double precoCamisa;
		String nome;
		char sexo;
		
		System.out.println("Entre com seu nome: ");
		nome = leia.nextLine();

		System.out.println("Qual o seu sexo: ");
		sexo = leia.nextLine().charAt(0);
		

		System.out.println("Qual é a sua idade : ");
		idade = leia.nextInt();

		System.out.println("Preço da Camisa: ");
		precoCamisa = leia.nextDouble();
		
		System.out.println("Nome digitado: " + nome);
		System.out.println("Sexo digitado: " + sexo);
		System.out.println("Idade digitada: " + idade);
		System.out.println("Valor da Camisa: " + precoCamisa);
	*/
		// operadores aritméticos (+, -, *, /, %)
		
		leia.close(); // fechando a instância

		

//Comentários sobre o código
	// dados de entrada se for INT e depois de String, ele vai dar erro
	// Para que o Java aceite você manda realizar novo comando após a instrução 
	/* 	System.out.println("Qual o seu sexo: ");
		sexo = leia.nextLine().charAt(0);
		leia.nextLine();
		System.out.println("Entre com seu nome: ");
	   nome = leia.nextLine();
	 * 	
	 */
	}

}
