
public class Main {
	public static void main(String[ ] args) {
		Cliente kelvya = new Cliente();
		kelvya.setNome("Kelvya");
		
		Conta cc = new ContaCorrente(kelvya);
		cc.deposito(100);
		
		Conta poupanca = new ContaPoupanca(kelvya);
		cc.transferencia(poupanca, 100);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
	
}
