package Principal;

import Dados.Funcionario;
import Dados.Gerente;
import Dados.Secretaria;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	Funcionario funcionario = new Funcionario ("José", "Desenvolvimento", "M", 53, 10000);
	Funcionario gerente = new Gerente("Janaina", "Gerente RH", "F", 20, 7500);
	Funcionario secretaria = new Secretaria("Augusto", "Desenvolvedor", "M", 53, 1200);
	
	funcionario.bonificacao();
	gerente.bonificacao();
	secretaria.bonificacao();
	
	System.out.println(funcionario);
	System.out.println(gerente);
	System.out.println(secretaria);
	

		
	}

}
