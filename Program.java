package principal;

import java.util.Scanner;

import Entities.Funcionario;

// Atividade Reforço - Senai - Desenvolvedores Java - 05/06/2023

public class Program {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o nome do funcionário: ");
		funcionario.nome = sc.nextLine();
		System.out.println("Entre com o cargo do funcionário: ");
		funcionario.cargo = sc.nextLine();
		System.out.println("Entre com o salario do funcionário: ");
		funcionario.salario = sc.nextDouble();
		
		System.out.println("Salário: ");
		funcionario.verificaComissao();
		
		sc.close();
		

	}

}
