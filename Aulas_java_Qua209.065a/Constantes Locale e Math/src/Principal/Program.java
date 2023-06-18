package Principal;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		final double PI = 3.1415; // uso do "final" é o comando que não altera o seu valor
		int valor1 = 50;
		int valor2 = 65;
		
		System.out.println(Math.pow(2, 2));//Classe utilitária, não precisa de nova inicialização
		System.out.println(Math.max(valor1,valor2));//retorna o maior deles - passa de 2 números como parâmetros
		System.out.println(Math.min(valor2, valor1));//é o inverso do max
		System.out.println(Math.sqrt(18));// retorna a raiz quadrada de um número
		System.out.println(Math.round(25.6578));//retorna o número arredondado.
		System.out.println(2 + Math.sqrt(18));
		System.out.println("o número de PI é: " + PI);
		System.out.println();
		System.out.println();
		
		Scanner leia = new Scanner(System.in);
		Locale ponto = new Locale("en", "us");//Criando classe com nova estância Localizando a biblioteca
		System.out.println("Entre com o valor do dolar: ");
		double dolar = leia.useLocale(ponto).nextDouble();
		
		System.out.println("Valor do dolar digitado: " + dolar);
		System.out.println();
		System.out.println();
		
		String nome = "Augusto Pinho";
		char sexo = 'M';
		int idade = 32;
		double altura = 1.83338414;
		
		System.out.printf("O meu nome é %s, sou do sexo %c, tenho %d anos, minha altura é %f", nome, sexo, idade, altura);
		//%s = string / %c = caracter(string) / %d = inteiro / %f = número flutuante, podendo ser double ou float 
		
		/* Operadores de comparação
		 * > maior que
		 * < menor que
		 * >= maior ou igual a 
		 * <= menor ou igual a
		 * != diferente de
		 * == igual a 
		 */
		/*Operadores lógicos
		 * && = e
		 * || = ou
		 * ! = negação
		 */

		/*Operadores lógicos &&(e) 	Opradores lógico || (ou)
		 *	 	v f f					v f v
		 *	 	f v f					f v v
		 *	 	v v v					v v v
		 * 		f f f					f f f
		 */
		
		leia.close();

	}
}
