package Principal;

import java.util.Random;

public class Sorteio {

public static void main(String[] args) {
	
		System.out.println(ganhador());
}
	static String ganhador() {
		Random random = new Random();
		int numeroSorteado = random.nextInt(11);
		String[] nomes = {"Jos� Luiz" , "Luan Muruk", "Claudia", "Matheus", "Leone", "Andr�", "Fernanda", "Elso", "Guilherme", "Kamylla"
		};
		return "O ganhador foi: " + nomes[numeroSorteado];
}
}
