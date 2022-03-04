public class ContaPoupanca extends Conta {
	
	private static final int TIPO_CONTA = 02;

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		super.tipoConta = TIPO_CONTA;	
		super.tarifa = 0;
	}
	
	@Override
	public void imprimirExtrato() {
		
		System.out.println("=== Extrato de conta poupança === ");
		super.imprimirInfosComuns();
		System.out.println("Tarifa a cobrar: " + tarifa);
	}
}
