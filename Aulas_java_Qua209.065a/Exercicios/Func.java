package Principal;

public class Func {

	public static void main(String[] args) {
// Estudar fun��es para aprimoramento da mat�ria
		
		mensagem();
		mensagem2(10.5);
		System.out.println(mensagem3());
		System.out.println(mensagem4(650)); //o retorno tem que ser informado no par�metro da fun��o
		System.out.println();
		int meuNumero = 750;
		System.out.println("O n�mero � informado na declara��o da vari�vel: " + meuNumero);
		
		//Exemplo que pode ser utilizado para convers�o de dado simples, sem valor.
		System.out.println(exemploIgor(16.6));
		
		/* o formato abaixo � apenas para refer�ncia de possibilidade de uso da funs��o String que usa retorno
		
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
		return "Aqui � minha fun��o de n�mero 3";
	}
	static String mensagem4(int x){
		return "N�mero informado: " + x;
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
	
