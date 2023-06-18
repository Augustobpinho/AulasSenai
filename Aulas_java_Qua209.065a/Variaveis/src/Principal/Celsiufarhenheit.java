package Principal;

import java.util.Scanner;

public class Celsiufarhenheit {

		public static void main(String[] args) {
//		Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.

//			(20 °C × 9/5) + 32 = 68 °F		
	    
		Scanner fah = new Scanner (System.in);
		
		double temp;
		double calc1 = 1.8; 
		double calc2 = 32;
		double resultado;
		
		System.out.println("Digite a temperatura em Celsius: ");
		temp = fah.nextDouble();
		resultado = temp * calc1 + calc2;
		System.out.println("A temperatura em Farhenheit é: " + resultado);
		
		fah.close();

		}

	}

