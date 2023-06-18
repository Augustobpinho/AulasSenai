package Principal;

import java.util.Random;

public class ExercicioDados {

	public static void main(String[] args) {
		
			/*Atividade if-else Jogo de dados
			Fa�a um programa para gerar 3 n�meros aleat�rios para 3 dados, mostre a soma dos n�meros que sa�ram. 
			Se 2 dados sa�rem com a mesma numera��o o jogador ganha 2 pontos de b�nus, se os 3 dados sa�rem com a mesma numera��o ele ganha 6 pontos de b�nus e 
			deve aparecer a mensagem "voc� � muito sortudo". 
			Se o total da soma dos dados mais o b�nus for menor que 15 o jogador perde e apresenta a mensagem "Lamento, mas voc� perdeu" , 
			se for maior ou igual a 15 ele ganha e apresenta a mensagem " Parab�ns, voc� ganhou!!)
			*/

			Random dado = new Random(); // random = biblioteca adiciona o �ndice at� o n�mero que queremos

			int dado1 = dado.nextInt(6) + 1;
			int dado2 = dado.nextInt(6) + 1;
			int dado3 = dado.nextInt(6) + 1;
			int soma;
			int bonus;

				soma = dado1 + dado2 + dado3;
				bonus = 2 ; 
				
				if (dado1 == dado2 && dado1 == dado3 && dado2 == dado3) {
					System.out.println("Voc� � sortudo e a soma dos dados �: " + soma);
				}
				else if (dado1 == dado2 || dado1 == dado3 || dado2 == dado3) {
					System.out.println("Jogador ganhou 2 porque a mais porque saiu dois lados iguais e a soma dos dados �: " + (soma + bonus));	
				}
				else if (soma <= 15){
					System.out.println("Lamento, voc� perdeu!");
				}
				else {
					System.out.println("parab�ns, voc� ganhou!");
				}
				System.out.println("A soma dos dados �: " +soma);
				System.out.println("Dado1 = " + dado1);
				System.out.println("Dado2 = " + dado2);
				System.out.println("Dado3 = " + dado3);
		}
}