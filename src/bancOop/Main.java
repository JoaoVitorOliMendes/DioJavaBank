package bancOop;

public class Main {

	public static void main(String[] args) {
		Conta cp = new ContaPoupanca();
		Conta cc = new ContaCorrente();

		System.out.println(cp.getSaldo());
		cp.depositar(150.99);
		System.out.println(cp.getSaldo());
		cp.sacar(50.99);
		System.out.println(cp.getSaldo());
		cp.transferir(100, cc);
		System.out.println(cp.getSaldo());
		System.out.println(cc.getSaldo());
		
	}

}
