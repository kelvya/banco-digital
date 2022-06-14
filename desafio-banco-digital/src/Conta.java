
public abstract class Conta implements InterfaceConta{
	private static final int AGENCIA_PADRAO = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	private static int SEQUENCIAL = 1;

	public Conta(Cliente cliente ) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	@Override
	public void saque(double valor) {
		saldo = saldo - valor; //saldo -= valor;
	}
	@Override
	public void deposito(double valor) {
		saldo = saldo + valor; //saldo += valor;
	}
	@Override
	public void transferencia(Conta contaDestino, double valor) {
		this.saque(valor);
		contaDestino.deposito(valor);
	}
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
