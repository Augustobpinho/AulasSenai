package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Aula 2 - Desenvolvimento JAVA - 08/05/2023 - SENAI
		// Declara��o scanner
	
		Scanner leia = new Scanner(System.in); // abrindo a inst�ncia Scanner
		//Classe scanner - importando da biblioteca Java
		//crtl+shift+o - importa todas as classes que nessecitam de importa��o.
		
/*		
		int idade;
		double precoCamisa;
		String nome;
		char sexo;
		
		System.out.println("Entre com seu nome: ");
		nome = leia.nextLine();

		System.out.println("Qual o seu sexo: ");
		sexo = leia.nextLine().charAt(0);
		

		System.out.println("Qual � a sua idade : ");
		idade = leia.nextInt();

		System.out.println("Pre�o da Camisa: ");
		precoCamisa = leia.nextDouble();
		
		System.out.println("Nome digitado: " + nome);
		System.out.println("Sexo digitado: " + sexo);
		System.out.println("Idade digitada: " + idade);
		System.out.println("Valor da Camisa: " + precoCamisa);
	*/
		// operadores aritm�ticos (+, -, *, /, %)
		
		leia.close(); // fechando a inst�ncia

		

//Coment�rios sobre o c�digo
	// dados de entrada se for INT e depois de String, ele vai dar erro
	// Para que o Java aceite voc� manda realizar novo comando ap�s a instru��o 
	/* 	System.out.println("Qual o seu sexo: ");
		sexo = leia.nextLine().charAt(0);
		leia.nextLine();
		System.out.println("Entre com seu nome: ");
	   nome = leia.nextLine();
	 * 	
	 */
	}

}
