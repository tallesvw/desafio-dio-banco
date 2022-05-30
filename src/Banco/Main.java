package Banco;

public class Main {
	public static void main(String[] args) {
		
		Cliente Talles = new Cliente();
		Talles.setNome("Talles");
		
		Conta cc = new ContaCorrente(Talles);
		Conta poupanca = new ContaPoupanca(Talles);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
