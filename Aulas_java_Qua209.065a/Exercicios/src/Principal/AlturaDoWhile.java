package Principal;

import java.util.Scanner;

public class AlturaDoWhile {

	public static void main(String[] args) {
		
		
	double alt1;
	double alt2;
	double alt3;
	double alt4;
	double alt5;
	double media;
	
	Scanner alt = new Scanner(System.in);

	System.out.println("Digite a altura do pessoal");
	alt1 = alt.nextDouble();
	System.out.println("Digite a altura do pessoal");
	alt2 = alt.nextDouble();
	System.out.println("Digite a altura do pessoal");
	alt3 = alt.nextDouble();
	media = ((alt1)/5);
	System.out.println("Digite a altura do pessoal");
	alt4 = alt.nextDouble();
	media = ((alt1)/5);
	System.out.println("Digite a altura do pessoal");
	alt5 = alt.nextDouble();
	media = ((alt1+alt2+alt3+alt4+alt5)/5);
	

	while(alt1 <= 5) {
	System.out.printf("Altura = %d\n", media);
	alt.close();
	}
}
}
