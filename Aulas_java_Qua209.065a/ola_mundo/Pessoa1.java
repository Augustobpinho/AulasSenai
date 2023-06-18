package principal;

import Pessoa.pessoa;

public class Pessoa1 {

	public static void main(String[] args) {
		
		pessoa pessoa = new pessoa();
		pessoa pessoa1 = new pessoa();
		
		pessoa.nome = "Augusto";
		pessoa.idade = 53;
		pessoa.sexo = "M";
		
		pessoa1.nome = "Pinho";
		pessoa1.idade = 53;
		pessoa1.sexo = "M";

			System.out.println("O nome é: " + pessoa.nome + " idade: " + pessoa.idade + " sexo: " + pessoa.sexo);
			System.out.println("O nome é: " + pessoa1.nome + " idade: " + pessoa1.idade + " sexo: " + pessoa1.sexo);
	}
}
