package principal;

import java.util.Scanner;

public class exercicioSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner salario = new Scanner (System.in);
			
			int hora;
			double salarioMensal;
			int dia;
//			int mes;
			double saldoSalario;
			
			System.out.println("Digite seu salario mensal: ");
			salarioMensal = salario.nextDouble();

			System.out.println("Dias trabalhados: ");
			dia = salario.nextInt();	
			
			System.out.println("Digite suas horas de trabalho: ");
			hora = salario.nextInt();


//			System.out.println("Qual o mês trabalhado: ");	
//			mes = salario.nextInt();
			
			saldoSalario = ((salarioMensal / dia)*hora);
			
			
			System.out.print("Seu salário é: " + saldoSalario);

			salario.close();
		

	}

}
