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
		Random dado = new Random(); // random = biblioteca adiciona o �ndice at� o n�mero que queremos

		int dado1 = dado.nextInt(6) +1;
		int dado2 = dado.nextInt(6) +1;
		int dado3 = dado.nextInt(6) +1;
		int soma;
		
		System.out.println("Os n�meros sorteados foram: " + "Dado 1: "+ dado1 + " | Dado 2: " + dado2 + " | Dado3: " + dado3);

		soma = dado1 + dado2 + dado3;

		System.out.println("A soma dos dados �: " + soma);
		int bonus = 0;
			if (dado1 == dado2 && dado1 == dado3 && dado2 == dado3) {
					bonus = 6; 
					System.out.println("Voc� � sortudo ganhou 6 pontos de b�nus");
				}
			else if (dado1 == dado2 || dado1 == dado3 || dado2 == dado3){
					bonus = 2;
					System.out.println("Jogador ganhou 2 pontos de b�nus!");	
				}
			int total = soma + bonus;
			System.out.println("Total de pontos: " + total);
				
			if (total < 15){
					System.out.println("Lamento, voc� perdeu!");
				}
			else {
					System.out.println("Parab�ns, voc� ganhou!");
				}

	}
}