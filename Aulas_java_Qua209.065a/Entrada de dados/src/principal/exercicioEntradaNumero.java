package principal;

import java.util.Scanner;

public class exercicioEntradaNumero {

	public static void main(String[] args) {
		// Exercício 2 - Desenvolvimento Java - Senai
		
	Scanner numero = new Scanner (System.in);
	
	int numero1;
	
	System.out.println("Digite um número : ");
	numero1 = numero.nextInt();
	
	System.out.println(numero1);
	
	numero.close(); 
	
	}

}
