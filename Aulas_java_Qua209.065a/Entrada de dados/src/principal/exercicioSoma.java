package principal;

import java.util.Scanner;

public class exercicioSoma {
	
	public static void main(String[] args) {
		
		Scanner num = new Scanner (System.in);
		
		int num1;
		int num2;
		int resul;
		
		System.out.println("Digite um número : ");
		num1 = num.nextInt();
		System.out.println("Digite um número : ");
		num2 = num.nextInt();
		resul = (num1 + num2);
		System.out.print("A soma dos resultados é: " + resul);

		num.close();
	}

}
