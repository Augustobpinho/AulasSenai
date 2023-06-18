package principal;

import java.util.Random;
import java.util.Scanner;

public class Exercicio17marco {

	public static void main(String[] args) {
/*Atividade if-else Jogo de dados
Faça um programa para gerar 3 números aleatórios para 3 dados, mostre a soma dos números que saíram. 
Se 2 dados saírem com a mesma numeração o jogador ganha 2 pontos de bônus, se os 3 dados saírem com a mesma numeração ele ganha 6 pontos de bônus e 
deve aparecer a mensagem "você é muito sortudo". 
Se o total da soma dos dados mais o bônus for menor que 15 o jogador perde e apresenta a mensagem "Lamento, mas você perdeu" , 
se for maior ou igual a 15 ele ganha e apresenta a mensagem "
*/
		Random dado = new Random(); // random = biblioteca adiciona o índice até o número que queremos

		int dado1 = dado.nextInt(6) +1;
		int dado2 = dado.nextInt(6) +1;
		int dado3 = dado.nextInt(6) +1;
		int soma;
		
		System.out.println("Os números sorteados foram: " + "Dado 1: "+ dado1 + " | Dado 2: " + dado2 + " | Dado3: " + dado3);

		soma = dado1 + dado2 + dado3;

		System.out.println("A soma dos dados é: " + soma);
		int bonus = 0;
			if (dado1 == dado2 && dado1 == dado3 && dado2 == dado3) {
					bonus = 6; 
					System.out.println("Você é sortudo ganhou 6 pontos de bônus");
				}
			else if (dado1 == dado2 || dado1 == dado3 || dado2 == dado3){
					bonus = 2;
					System.out.println("Jogador ganhou 2 pontos de bônus!");	
				}
			int total = soma + bonus;
			System.out.println("Total de pontos: " + total);
				
			if (total < 15){
					System.out.println("Lamento, você perdeu!");
				}
			else {
					System.out.println("Parabéns, você ganhou!");
				}

	}
}