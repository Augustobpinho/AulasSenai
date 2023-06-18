package Principal;

import java.util.Random;

public class Retorna1ou0 {

	public static void main(String[] args) {
//   2. Faça um programa onde o 1 é sim e 0 é não, toda vez que for sim entre em um bloco de código 
//		      e some mais 1 a uma variável contadora;		
		Random exec = new Random(); 
		int num1 = 0;
		boolean exec1 = exec.nextBoolean();
		
		if (exec1 == true) {
			System.out.println("Condição verdadeira, somou 1: " + (num1+1));
		}
		else {
			System.out.println("Sair");
		}


}
}

