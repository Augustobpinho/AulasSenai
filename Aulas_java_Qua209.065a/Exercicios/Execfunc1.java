package Principal;

import java.util.Scanner;

public class Execfunc1 {

	public static void main(String[] args) {
	somaDoisNumeros(2, 5);
}
	static void somaDoisNumeros(int x, int y) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o primeiro número da soma: ");
		int num1 = sc.nextInt();
		System.out.println("Entre com o segundo número da soma: ");
		int num2 = sc.nextInt();
		somaDoisNumeros(num1, num2);
		System.out.println("Abaixo os números foam atribuídos manualmente");
		int resultado = x + y;
		System.out.println("O resultado da soma é :" + resultado);
		System.out.println("outra forma de mostrar o resultado da soma : "  + (x + y));
		sc.close();
	}
}
