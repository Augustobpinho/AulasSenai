package Principal;

public class Program {

	public static void main(String[] args) {
		

		
		/* Vari�veis s�o espa�os alocados na mem�ria que salva uma informa��o (um dado)
		 * 
		 * O tipo "INT" armazena n�meros inteiros
		 * int s�o n�meros: 1, 2, 3, 10 .....
		 * double - n�meros com casas decimais: 10.3 - 4.10 etc
		 * char - tipo que armazena caracter - � um tipo "literal" e a sua inicializa��o � feita com aspas simples - 
		 *        c, d, a, 1, 2....
		 * String - � uma classe do java utilizada para armazenar cadeias de caracteres - palavras, frases e etc.
		 *        sua inicializa��o � feita com aspas duplas - nomes, locais....
		 * 
		 */
		// Algor�timos - sequ�ncia l�gica de resultado esperado
		// tipos de vari�vel tipo CHAR ele tem que ser em aspas simples, pois o java n�o reconhece
		// Java � case sensitive, ou seja, ele analisa tipos de vari�veis e nomes de vari�veis, se n�o estiver exatamente do jeito que est�
		// retorna erro
		// Boas pr�ticas 1: nomes com refer�ncia ao termo que voc� vai usar
		// Boas pr�ticas 2: Estilo camel case - ou seja, primeira palavra em min�scula, segunda palarvra iniciando em mai�scula
		// Boas pr�ticas 3: n�o usar �, acentos e caracteres especiais
		
	int numero = 10;
	double precoCamisa = 20.52;
	String nome = "Augusto";
	char sexo = 'M';
	
	int num1 = 5;
	int num2 = 10;
	int resultado = num1 + num2;
	
	String nomeSobrenome = "Augusto Pinho";
	int idade = 52;
	double saldoBancario = 0.02;

	System.out.println("Aula 2 - Desenvolvimento Java - SENAI - 05/05/2023");
	System.out.println();	
	
	System.out.println(numero);
	System.out.println(precoCamisa);
	
	System.out.println(nome);
	System.out.println(sexo);
	
	precoCamisa = 50.65;
	System.out.println(precoCamisa);
	
	System.out.print(nome);
	System.out.print(sexo);
	System.out.print(precoCamisa);
	System.out.println(); // quebra de linha
	System.out.println();
	System.out.print(nome + " " + sexo + " " + precoCamisa); // "+" Concatena��o de nomes com comandos
	System.out.println();
	System.out.print(nome + " comprou uma camisa por R$ " + precoCamisa);
	System.out.println();
	System.out.println();
	//System.out.print(); sem quebra de linha
	
	nome = "Pinho";
	precoCamisa = 100.01;
	
	System.out.println();
	System.out.print(nome + " comprou uma camisa por R$ " + precoCamisa);
	System.out.println();
	System.out.println();
	System.out.println(nome);
	System.out.println(precoCamisa);
	System.out.println();
	System.out.println();
	System.out.println(2 + 2);
	System.out.println();
	System.out.println(num1 + num2);
	System.out.println("O resultado � : " + resultado);
	System.out.println("O resultado � : " + (num1 + num2)); // regra de matem�tica - primeiro resolva uma prioridade, depois outra.
	System.out.println();
	System.out.println();
	
	/*
	 * Crie uma variavel com seu nome; idade; saldo de conta;
	 * mostre na tela a frase: Augusto Pinho tem 32 anos e possui R$ 5 na conta;
	 */
	
	System.out.println(nomeSobrenome + " tem " + idade + " anos e possui R$ " + saldoBancario 
			+ " na conta banc�ria");
	
	}

}
