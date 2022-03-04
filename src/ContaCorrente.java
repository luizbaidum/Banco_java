public class ContaCorrente extends Conta {
	
	private static final int TIPO_CONTA = 01;

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		super.tipoConta = TIPO_CONTA;	
		super.tarifa = 10;
	}
	
	@Override
	public void imprimirExtrato() {
		
		System.out.println("=== Extrato de conta corrente === ");
		super.imprimirInfosComuns();
		System.out.println("Tarifa a cobrar: " + tarifa);
	}
}
