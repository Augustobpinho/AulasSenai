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

		Random randon = new Random(); // random = biblioteca adiciona o índice até o número que queremos

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
			System.out.println("A soma dos dados é : " + soma);
		}
		numero.close();
	}

}
