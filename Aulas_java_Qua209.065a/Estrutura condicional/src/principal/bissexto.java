package principal;

import java.util.Scanner;

public class bissexto {

	// Fa�a um programa que pe�a para o usu�rio entrar com um ano e dizer se esse ano �	bissexto ou n�o;

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
			
		int ano;
		System.out.println("Entre com o ano");
		ano = leia.nextInt();

		if ((ano % 4 == 0 && ano % 100!= 0) || ano % 400 == 0) {
			System.out.println("Ano Bissexto!");
		}
		else {
			System.out.println("Ano normal!");
		}
		leia.close();
	}

}
