public class ContaEstudante extends Conta {
	
	private static final int TIPO_CONTA = 03;
	private double TARIFA_ESTUDANTE = 5;
	
	public ContaEstudante(Cliente cliente) {
		super(cliente);
		super.tipoConta = TIPO_CONTA;	
		super.tarifa = TARIFA_ESTUDANTE;
	}

	@Override
	public void imprimirExtrato() {
		
		System.out.println("=== Extrato de conta de estudante === ");
		super.imprimirInfosComuns();		
		System.out.println("Tarifa a cobrar: " + tarifa);
	}
}
