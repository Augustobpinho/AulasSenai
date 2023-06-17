package Dados;

public class Gerente extends Funcionario {


		
		public Gerente(String nome, int idade, String sexo, String departamento, double salario, int bonificacao) {
		super(nome, idade, sexo, departamento, salario);
	
	}

	@Override
		
		public void bonificacao(double salario) {
			// TODO Auto-generated method stub
			salario += salario + 500;
		
		int bonificacao = 500;
		
		salario = salario + bonificacao;
		
	}
}
