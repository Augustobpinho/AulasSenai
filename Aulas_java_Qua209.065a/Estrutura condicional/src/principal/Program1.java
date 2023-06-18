package principal;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		//Faça um programa que leia 3 números e mostre o maior deles;
		
		 int num1;
		 int num2;
		 int num3;
		 
		 Scanner leia = new Scanner(System.in);
			System.out.println("Digite primeiro número");
			num1 = leia.nextInt();
			System.out.println("Digite o número 2");
			num2 = leia.nextInt();
			System.out.println("Digite o terceiro número");
			num3 = leia.nextInt();
		 
	/*	if (num1 >= num2 && num1 >= num3){
			System.out.println("O numero 1 é maior!");
		}
		if (num2 >= num1 && num1 >= num3){
				System.out.println("O número 2 é maior!");
		}
		if (num3 >= num1 && num1 >= num2){
			System.out.println("O número 3 é maior!");
//5		else {
//			System.out.println("O número 3 é maior!");
		}
*/
		if (num1 >= num2 && num1 >= num3){
			System.out.println("O maior número é: " + num1);	
		}
		else if (num2 > num3) {
			System.out.println("O maior número é: " + num2);
		}
		else {
			System.out.println("O maior número é: " + num3);
		}
			leia.close();
		
		
	
	}

}


