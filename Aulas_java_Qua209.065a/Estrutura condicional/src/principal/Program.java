package principal;
//Aula Desenvolvimento Java - 11/05/2023 - Senai

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 25;
		boolean bool = false;
		
		if (num1 >= num2) {
			System.out.println("N�mero 1 � o maior");
		}
		else {
			System.out.println("N�mero 2 � o maior");
		if(!bool == true) {
			System.out.println("Verdadeiro");
		}
		else {
			System.out.println("Falso");
		}
		//Exemplo usando resto da divis�o
		
		Scanner leia = new Scanner(System.in);
			
		int numero;
		System.out.println("Entre com um numero para saber se � par ou impar");
		numero = leia.nextInt();

		if (numero % 2 == 0) {
			System.out.println("Numero par!");
		}
		else {
			System.out.println("Numero �mpar!");
		}
		leia.close();
	}
	}
}