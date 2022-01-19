package bancOop;

public abstract class Conta implements IConta {
	
	protected static final int AGENCIA = 0; 
	protected static int SEQUENCIAL = 0; 
	
	protected int agencia;
	protected int numero;
	protected double saldo = 0;
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}

	public Conta(int agencia, int numero, double saldo) {
		super();
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	public Conta() {
		this.numero = SEQUENCIAL++;
		this.agencia = Conta.AGENCIA;
	}
	
	
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta destinatario) {
		this.sacar(valor);
		destinatario.depositar(valor);
	}
}
