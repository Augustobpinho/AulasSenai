package Principal;

public class ExercicioNumeros {

	public static void main(String[] args) {
		
/*		1 Programa em Java que mostra os n�meros �mpares ate 25
		2 Altere o primeiro programa para mostrar a soma dos n�meros impares
		3 altere novamente o programa para mostrar os n�meros impares um abaixo do outro e depois um ao lado do outro
*/
	
//Exerc�cio 1
		for(int num = 1; num <= 25; num +=2 ) {
		System.out.println("N�meros impares: " + num);
	}
//Exerc�cio 2	
	int soma = 0;
	for(int num = 1; num <= 25; num +=2) {
		if(num %2!=0);
		soma = (soma + num);
		System.out.println("A soma dos n�meros �: "+ soma);
	}
//Exerc�cio 3
	for(int num = 1; num <= 25; num +=2) {
		System.out.printf("[%d]", num);
	}
	}
}



			
