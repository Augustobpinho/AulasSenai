package Principal;

import java.util.Scanner;

public class ArgumentoArrays {

	public static void main(String[] args) {
	
		//Fa�a um programa com uma fun��o que necessite de tr�s argumentos e que forne�a a soma desses tr�s argumentos.
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Entre com os tr�s n�meros a serem somados");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		somarNum(n1, n2, n3);
		sc.close();
	}
		static void somarNum(int n1, int n2, int n3 ) {
			System.out.println("A soma dos n�meros �: ");
			System.out.println(n1+n2+n3);

	}

	 
	
	
	
	
}
