package Principal;

import java.util.Scanner;

public class ArgumentoArrays {

	public static void main(String[] args) {
	
		//Faça um programa com uma função que necessite de três argumentos e que forneça a soma desses três argumentos.
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Entre com os três números a serem somados");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		somarNum(n1, n2, n3);
		sc.close();
	}
		static void somarNum(int n1, int n2, int n3 ) {
			System.out.println("A soma dos números é: ");
			System.out.println(n1+n2+n3);

	}

	 
	
	
	
	
}
