package Principal;

public class ExercicioNumeros {

	public static void main(String[] args) {
		
/*		1 Programa em Java que mostra os números ímpares ate 25
		2 Altere o primeiro programa para mostrar a soma dos números impares
		3 altere novamente o programa para mostrar os números impares um abaixo do outro e depois um ao lado do outro
*/
	
//Exercício 1
		for(int num = 1; num <= 25; num +=2 ) {
		System.out.println("Números impares: " + num);
	}
//Exercício 2	
	int soma = 0;
	for(int num = 1; num <= 25; num +=2) {
		if(num %2!=0);
		soma = (soma + num);
		System.out.println("A soma dos números é: "+ soma);
	}
//Exercício 3
	for(int num = 1; num <= 25; num +=2) {
		System.out.printf("[%d]", num);
	}
	}
}



			
