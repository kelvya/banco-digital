
public interface InterfaceConta {
	void saque(double valor);
	void deposito(double valor);
	void transferencia(Conta contaDestino, double valor);
	void imprimirExtrato( );
	
}
