package Entities;

public class Funcionario {
	
/*Faça um programa que tenha uma classe funcionário com os atributos nome, cargo, salario. 
Verifique o salario e o cargo, se for gerente e ganhar menos que 5 mil, recebe um bônus 
no salario de 1.5 % no valor do salario base, se for funcionário e ganhar menos que 1500 
ganha 2% sobre o salario base. Mostre o valor do salario bruto atualizado e os dados do funcionário;
*/

	public String cargo;
	public String nome;
	public double salario;
	
	public void verificaComissao() {
		if(cargo.equals("gerente") && salario < 5000) {
			salario = salario + (salario * 0.015);
		} 
		if(cargo.equals("vendedor") && salario < 1500) {
			salario = salario + (salario * 0.02);
		}
		System.out.println(salario);
	}
}
