package Dados;

public class Gerente extends Funcionario {

	
	public Gerente() {
		super();
	}

	public Gerente(String nome, String departamento, String sexo, int idade, double salario) {
		super(nome, departamento, sexo, idade, salario);

	}

	@Override
	public void bonificacao() {

			this.salario += 500.00;
		} 	
}
