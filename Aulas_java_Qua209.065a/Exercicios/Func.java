package Principal;

public class Func {

	public static void main(String[] args) {
// Estudar funções para aprimoramento da matéria
		
		mensagem();
		mensagem2(10.5);
		System.out.println(mensagem3());
		System.out.println(mensagem4(650)); //o retorno tem que ser informado no parâmetro da função
		System.out.println();
		int meuNumero = 750;
		System.out.println("O número é informado na declaração da variável: " + meuNumero);
		
		//Exemplo que pode ser utilizado para conversão de dado simples, sem valor.
		System.out.println(exemploIgor(16.6));
		
		/* o formato abaixo é apenas para referência de possibilidade de uso da funsção String que usa retorno
		
		String recebemensagem = mensagem3();
		System.out.println(recebemensagem);
	*/	
	}
	static void mensagem() {
		System.out.println("Primeiro void");
	}
	static void mensagem2(double n) {
		System.out.println("O numero informado foi: " + n);
	}
	static String mensagem3() {
		return "Aqui é minha função de número 3";
	}
	static String mensagem4(int x){
		return "Número informado: " + x;
	}
	static int exemploIgor(double y) {
		return (int)y;
	}
	static void mensagem5 (int mensagem5){
		System.out.println(mensagem5);
	}
	static void mensagem6 (int mensagem6){
		System.out.println(mensagem6);
	}
}
	
