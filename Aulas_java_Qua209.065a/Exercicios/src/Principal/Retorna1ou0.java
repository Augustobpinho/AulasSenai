package Principal;

import java.util.Random;

public class Retorna1ou0 {

	public static void main(String[] args) {
//   2. Fa�a um programa onde o 1 � sim e 0 � n�o, toda vez que for sim entre em um bloco de c�digo 
//		      e some mais 1 a uma vari�vel contadora;		
		Random exec = new Random(); 
		int num1 = 0;
		boolean exec1 = exec.nextBoolean();
		
		if (exec1 == true) {
			System.out.println("Condi��o verdadeira, somou 1: " + (num1+1));
		}
		else {
			System.out.println("Sair");
		}


}
}

