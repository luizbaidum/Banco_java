public abstract class Conta implements iConta {

	//ATRIBUTOS
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected int tipoConta; //1 = corrente, 2 = poupança, 3 = estudante.
	protected double tarifa; //R$ 10 = corrente, R$ 0 = poupança, R$ 5 = estudante;
	protected Cliente cliente;
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public double getTipoConta() {
		return tipoConta;
	}

	public double getTarifa() {
		return tarifa;
	}
	
	//MÉTODOS VINDOS DA INTERFACE iCONTA
	@Override
	public void sacar(double valor) {
		this.saldo = saldo - valor;		
	}

	@Override
	public void depositar(double valor) {
		this.saldo = saldo + valor;	
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular ID: %d", this.cliente.getIdCliente()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
	//INSTANCIAS
	private static int SEQUENCIAL = 100;
	private static final int AGENCIA_PADRAO = 01;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
}
