package principal;

import java.util.Scanner;

import Entities.Funcionario;

// Atividade Refor�o - Senai - Desenvolvedores Java - 05/06/2023

public class Program {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o nome do funcion�rio: ");
		funcionario.nome = sc.nextLine();
		System.out.println("Entre com o cargo do funcion�rio: ");
		funcionario.cargo = sc.nextLine();
		System.out.println("Entre com o salario do funcion�rio: ");
		funcionario.salario = sc.nextDouble();
		
		System.out.println("Sal�rio: ");
		funcionario.verificaComissao();
		
		sc.close();
		

	}

}
