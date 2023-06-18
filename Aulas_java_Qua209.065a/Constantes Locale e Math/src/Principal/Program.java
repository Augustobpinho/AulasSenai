package Principal;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		final double PI = 3.1415; // uso do "final" � o comando que n�o altera o seu valor
		int valor1 = 50;
		int valor2 = 65;
		
		System.out.println(Math.pow(2, 2));//Classe utilit�ria, n�o precisa de nova inicializa��o
		System.out.println(Math.max(valor1,valor2));//retorna o maior deles - passa de 2 n�meros como par�metros
		System.out.println(Math.min(valor2, valor1));//� o inverso do max
		System.out.println(Math.sqrt(18));// retorna a raiz quadrada de um n�mero
		System.out.println(Math.round(25.6578));//retorna o n�mero arredondado.
		System.out.println(2 + Math.sqrt(18));
		System.out.println("o n�mero de PI �: " + PI);
		System.out.println();
		System.out.println();
		
		Scanner leia = new Scanner(System.in);
		Locale ponto = new Locale("en", "us");//Criando classe com nova est�ncia Localizando a biblioteca
		System.out.println("Entre com o valor do dolar: ");
		double dolar = leia.useLocale(ponto).nextDouble();
		
		System.out.println("Valor do dolar digitado: " + dolar);
		System.out.println();
		System.out.println();
		
		String nome = "Augusto Pinho";
		char sexo = 'M';
		int idade = 32;
		double altura = 1.83338414;
		
		System.out.printf("O meu nome � %s, sou do sexo %c, tenho %d anos, minha altura � %f", nome, sexo, idade, altura);
		//%s = string / %c = caracter(string) / %d = inteiro / %f = n�mero flutuante, podendo ser double ou float 
		
		/* Operadores de compara��o
		 * > maior que
		 * < menor que
		 * >= maior ou igual a 
		 * <= menor ou igual a
		 * != diferente de
		 * == igual a 
		 */
		/*Operadores l�gicos
		 * && = e
		 * || = ou
		 * ! = nega��o
		 */

		/*Operadores l�gicos &&(e) 	Opradores l�gico || (ou)
		 *	 	v f f					v f v
		 *	 	f v f					f v v
		 *	 	v v v					v v v
		 * 		f f f					f f f
		 */
		
		leia.close();

	}
}
