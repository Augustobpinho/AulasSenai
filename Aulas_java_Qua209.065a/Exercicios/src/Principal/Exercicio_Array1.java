package Principal;

import java.util.Scanner;

public class Exercicio_Array1 {

	public static void main(String[] args) {
	//*Faça um programa que receba o nome do aluno e as 4 notas bimestrais desse aluno e mostre a media;

		
		Scanner sc = new Scanner(System.in);

		double[] notas = new double[4];
		
		System.out.print("Entre com o nome do aluno?");
		String nomeAluno = sc.nextLine();

		double somaNotas = 0;
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Entre com a nota: " + (i + 1) + ":  ");
			notas[i] = sc.nextDouble();
			somaNotas += notas[i];
		}
		System.out.println("A media do aluno " + nomeAluno + " é: " + (somaNotas /notas.length));
		sc.close();

		}
 


/*		
		
		Scanner sc = new Scanner(System.in);
		int[] notas 
		
		System.out.print("Número de alunos:");
		int qtd = sc.nextInt();
		sc.nextLine();
		
		String[] nomes = new String[qtd];
	
		for(int contador = 0; contador <nomes.length; contador++) {
		
		System.out.println("Entre com o nome: ");
		
		nomes[contador] = sc.nextLine();

	*/	

	}

