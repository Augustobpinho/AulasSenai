package principal;

import java.util.Random;
import java.util.Scanner;

public class Exercicio17marco {

	public static void main(String[] args) {
/*Atividade if-else Jogo de dados
Fa�a um programa para gerar 3 n�meros aleat�rios para 3 dados, mostre a soma dos n�meros que sa�ram. 
Se 2 dados sa�rem com a mesma numera��o o jogador ganha 2 pontos de b�nus, se os 3 dados sa�rem com a mesma numera��o ele ganha 6 pontos de b�nus e 
deve aparecer a mensagem "voc� � muito sortudo". 
Se o total da soma dos dados mais o b�nus for menor que 15 o jogador perde e apresenta a mensagem "Lamento, mas voc� perdeu" , 
se for maior ou igual a 15 ele ganha e apresenta a mensagem "
*/

		Random randon = new Random(); // random = biblioteca adiciona o �ndice at� o n�mero que queremos

		int opcao = randon.nextInt(3) + 1;
		System.out.println(opcao);
		
		Scanner numero = new Scanner(System.in);
		
		int dado1;
		int dado2;
		int dado3;
		int soma;
		
		System.out.println("Jogue o primeiro dado");
		dado1 = numero.nextInt();
		System.out.println("Jogue o segundo dado");
		dado2 = numero.nextInt();
		System.out.println("Jogue o terceiro dado");
		dado3 = numero.nextInt();
		
//		dado1 <= 4;
		soma = dado1 + dado2 + dado3;
		
		if (dado1 >= dado2 && dado1 >= dado3){
			System.out.println("Jogador ganhou 2 pontos");	
		}
		if (dado2 >= dado3 || soma <= 12) {
			System.out.println("A soma dos dados � : " + soma);
		}
		numero.close();
	}

}
