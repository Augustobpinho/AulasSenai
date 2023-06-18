package Principal;


import java.util.Scanner;

public class altura {

	public static void main(String[] args) {
/* 1. Faça um programa que leia a altura de 5 pessoas e mostre a media de altura entre elas;

   3. Faça o mesmo programa do exercício 1 mas usando while;
*/

		 double alt1;
		 double alt2;
		 double alt3;
		 double alt4;
		 double alt5;
		 double media;

		 Scanner alt = new Scanner(System.in);
		 	System.out.println("Altura 1:");
		 alt1 = alt.nextDouble();
		 	System.out.println("Altura 2:");
		 alt2 = alt.nextDouble();
		 	System.out.println("Altura 3:");
		 alt3 = alt.nextDouble();
		 	System.out.println("Altura 4:");
		 alt4 = alt.nextDouble();
		 	System.out.println("Altura 5:");
		 alt5 = alt.nextDouble();
		 media = ((alt1 + alt2 + alt3 + alt4 +alt5)/5);
		
		 	System.out.println("A média de altura é: " + media);
					
		
	alt.close();
	}
		
}
