package principal;

import java.util.Scanner;

public class nota {

	public static void main(String[] args) {
/*		Faça um programa que leia 4 notas de um aluno e retorne a media, se media maior que 
		5 e menor que 6 reprovado, se media entre 6 e 7 recuperação, se media acima de
		7 aprovado, se media 10 aprovado com honras;
*/
	
	 Scanner leia = new Scanner(System.in);

	 double nota1;
	 double nota2;
	 double nota3;
	 double nota4;
	 double media;

	 System.out.println("Digite a primeira nota:");
	 nota1 = leia.nextDouble();
	 System.out.println("Digite a segunda nota:");
	 nota2 = leia.nextDouble();
	 System.out.println("Digite a terceira nota:");
	 nota3 = leia.nextDouble();
	 System.out.println("Digite a quarta nota:");
	 nota4 = leia.nextDouble();
	 media = ((nota1 + nota2 + nota3 + nota4)/4);
	
		if (media < 6){
			System.out.println("Aluno reprovado");
		}
		else if (media >= 6 && media < 7){
			System.out.println("Aluno em recuperação");
		}
		else if (media >= 7 && media < 10){
			System.out.println("Aluno aprovado");
		}
		else {
			System.out.println("Aluno aprovado com louvor");
		}
	
	
leia.close();
		
		
		}
	}
	
	
