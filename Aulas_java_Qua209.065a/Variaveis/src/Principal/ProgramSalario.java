package Principal;

import java.util.Scanner;

public class ProgramSalario {
	
	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	double salarioBruto;
	double inss;
	double ir;
	double salarioLiquido;
	
	System.out.println("Entre com o seu salário: ");
	salarioBruto = leia.nextDouble();
	
	inss = salarioBruto * 0.05;
	ir = salarioBruto * 0.11;
	salarioLiquido = salarioBruto - inss -ir;
	
	System.out.println("Desconto inss: " + inss);
	System.out.println("Desconto imposto de renda: " + ir);
	System.out.println("Salário Líquido: R$:" + salarioLiquido);
	leia.close();
	}

}