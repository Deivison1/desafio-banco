package desafio.banco;

public class Main {

	public static void main(String[] args) {
		
		
		Cliente deivison = new Cliente();
		deivison.setNome("Deivison");
		
		Conta cc = new ContaCorrente(deivison);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(deivison);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}
}
