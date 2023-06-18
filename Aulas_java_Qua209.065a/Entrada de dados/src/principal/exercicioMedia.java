package principal;

import java.util.Scanner;

public class exercicioMedia {

	public static void main(String[] args) {
		
		Scanner nota = new Scanner (System.in);
		
		int notaPrimBimestre;
		int notaSegBimestre;
		int notaTerBimestre;
		int notaQuarBimestre;
		int media;
		
		System.out.println("Digite a nota do Primeiro Bimestre: ");
		notaPrimBimestre = nota.nextInt();
		System.out.println("Digite a nota do Segundo Bimestre: ");
		notaSegBimestre = nota.nextInt();
		System.out.println("Digite a nota do Terceiro Bimestre: ");
		notaTerBimestre = nota.nextInt();
		System.out.println("Digite a nota do Quarto Bimestre: ");	
		notaQuarBimestre = nota.nextInt();
		media = ((notaPrimBimestre + notaSegBimestre + notaTerBimestre + notaQuarBimestre)/4);
		System.out.print("A média das notas é: " + media);

		nota.close();
	
		
	}
}
