public class Cliente {
	
	private int SEQUENCIALCLIENTE = 1;
	
	//ATRIBUTOS
	private String nome;
	private String cpf;
	private int idCliente = SEQUENCIALCLIENTE++;
	
	//dados cliente
	private String endereco;
	private int idade;
	private double renda;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	//dados cliente
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	protected void imprimiDadosCliente() {
		System.out.println(String.format("Nome: %s",  this.getNome()));
		System.out.println(String.format("Documento: %s",  this.getCpf()));
		System.out.println(String.format("Cliente ID: %d",  this.getIdCliente()));
		System.out.println(String.format("Idade: %d",  this.getIdade()));
		System.out.println(String.format("Renda: %.2f",  this.getRenda()));
	}
}
