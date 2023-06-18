package Principal;

import java.util.Random;

public class ExercicioDados {

	public static void main(String[] args) {
		
			/*Atividade if-else Jogo de dados
			Faça um programa para gerar 3 números aleatórios para 3 dados, mostre a soma dos números que saíram. 
			Se 2 dados saírem com a mesma numeração o jogador ganha 2 pontos de bônus, se os 3 dados saírem com a mesma numeração ele ganha 6 pontos de bônus e 
			deve aparecer a mensagem "você é muito sortudo". 
			Se o total da soma dos dados mais o bônus for menor que 15 o jogador perde e apresenta a mensagem "Lamento, mas você perdeu" , 
			se for maior ou igual a 15 ele ganha e apresenta a mensagem " Parabéns, você ganhou!!)
			*/

			Random dado = new Random(); // random = biblioteca adiciona o índice até o número que queremos

			int dado1 = dado.nextInt(6) + 1;
			int dado2 = dado.nextInt(6) + 1;
			int dado3 = dado.nextInt(6) + 1;
			int soma;
			int bonus;

				soma = dado1 + dado2 + dado3;
				bonus = 2 ; 
				
				if (dado1 == dado2 && dado1 == dado3 && dado2 == dado3) {
					System.out.println("Você é sortudo e a soma dos dados é: " + soma);
				}
				else if (dado1 == dado2 || dado1 == dado3 || dado2 == dado3) {
					System.out.println("Jogador ganhou 2 porque a mais porque saiu dois lados iguais e a soma dos dados é: " + (soma + bonus));	
				}
				else if (soma <= 15){
					System.out.println("Lamento, você perdeu!");
				}
				else {
					System.out.println("parabéns, você ganhou!");
				}
				System.out.println("A soma dos dados é: " +soma);
				System.out.println("Dado1 = " + dado1);
				System.out.println("Dado2 = " + dado2);
				System.out.println("Dado3 = " + dado3);
		}
}