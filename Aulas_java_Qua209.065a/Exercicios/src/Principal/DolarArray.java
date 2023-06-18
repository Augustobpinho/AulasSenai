package Principal;

import java.util.Scanner;

public class DolarArray {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Entre com o valor do dolar: ");
		double valorCotacao = sc.nextDouble();
		
		System.out.println("Entre com o valor do real: ");
		double valorAConverter = sc.nextDouble();
		
		converterDolar(valorCotacao, valorAConverter);
		
		sc.close();
	}
	
	static void converterDolar(double cotacao, double valor) {
	double valorConvertidoParaDolar = valor / cotacao;
	double valorConvertidoParaReal = valor * cotacao;
	System.out.println(" Real para Dolar: " + valorConvertidoParaDolar);
	System.out.println("Dolar para Real: " + valorConvertidoParaReal);
	
	}

}
