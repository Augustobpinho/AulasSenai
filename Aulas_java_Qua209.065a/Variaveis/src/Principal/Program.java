package Principal;

public class Program {

	public static void main(String[] args) {
		

		
		/* Variáveis são espaços alocados na memória que salva uma informação (um dado)
		 * 
		 * O tipo "INT" armazena números inteiros
		 * int são números: 1, 2, 3, 10 .....
		 * double - números com casas decimais: 10.3 - 4.10 etc
		 * char - tipo que armazena caracter - é um tipo "literal" e a sua inicialização é feita com aspas simples - 
		 *        c, d, a, 1, 2....
		 * String - é uma classe do java utilizada para armazenar cadeias de caracteres - palavras, frases e etc.
		 *        sua inicialização é feita com aspas duplas - nomes, locais....
		 * 
		 */
		// Algorítimos - sequência lógica de resultado esperado
		// tipos de variável tipo CHAR ele tem que ser em aspas simples, pois o java não reconhece
		// Java é case sensitive, ou seja, ele analisa tipos de variáveis e nomes de variáveis, se não estiver exatamente do jeito que está
		// retorna erro
		// Boas práticas 1: nomes com referência ao termo que você vai usar
		// Boas práticas 2: Estilo camel case - ou seja, primeira palavra em minúscula, segunda palarvra iniciando em maiúscula
		// Boas práticas 3: não usar Ç, acentos e caracteres especiais
		
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
	System.out.print(nome + " " + sexo + " " + precoCamisa); // "+" Concatenação de nomes com comandos
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
	System.out.println("O resultado é : " + resultado);
	System.out.println("O resultado é : " + (num1 + num2)); // regra de matemática - primeiro resolva uma prioridade, depois outra.
	System.out.println();
	System.out.println();
	
	/*
	 * Crie uma variavel com seu nome; idade; saldo de conta;
	 * mostre na tela a frase: Augusto Pinho tem 32 anos e possui R$ 5 na conta;
	 */
	
	System.out.println(nomeSobrenome + " tem " + idade + " anos e possui R$ " + saldoBancario 
			+ " na conta bancária");
	
	}

}
