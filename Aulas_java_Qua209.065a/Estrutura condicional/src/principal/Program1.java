package principal;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		//Fa�a um programa que leia 3 n�meros e mostre o maior deles;
		
		 int num1;
		 int num2;
		 int num3;
		 
		 Scanner leia = new Scanner(System.in);
			System.out.println("Digite primeiro n�mero");
			num1 = leia.nextInt();
			System.out.println("Digite o n�mero 2");
			num2 = leia.nextInt();
			System.out.println("Digite o terceiro n�mero");
			num3 = leia.nextInt();
		 
	/*	if (num1 >= num2 && num1 >= num3){
			System.out.println("O numero 1 � maior!");
		}
		if (num2 >= num1 && num1 >= num3){
				System.out.println("O n�mero 2 � maior!");
		}
		if (num3 >= num1 && num1 >= num2){
			System.out.println("O n�mero 3 � maior!");
//5		else {
//			System.out.println("O n�mero 3 � maior!");
		}
*/
		if (num1 >= num2 && num1 >= num3){
			System.out.println("O maior n�mero �: " + num1);	
		}
		else if (num2 > num3) {
			System.out.println("O maior n�mero �: " + num2);
		}
		else {
			System.out.println("O maior n�mero �: " + num3);
		}
			leia.close();
		
		
	
	}

}


