package Principal;

import java.util.Scanner;

public class FahhenheitCelsius {

	
	public static void main(String[] args) {	
//		Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.

//		•C = 5 * ((F-32) / 9)
//		c -(F -32)*(5/9)
    
	Scanner fah = new Scanner (System.in);
	
	double temp;
	double calc1 = 5.0/9.0; 
	double calc2 = 32;
	double resultado;
	
	System.out.println("Digite a temperatura em Fahrenheit: ");
	temp = fah.nextDouble();
	resultado = (temp-calc2)*calc1;
	System.out.println("A temperatura em Celsius é: " + resultado);
	
	fah.close();
	}
}
