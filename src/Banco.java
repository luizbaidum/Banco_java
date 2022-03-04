public class Banco {
	
	//ATRIBUTOS
	private String nome;
	private int codigoBanco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigoBanco() {
		return codigoBanco;
	}

	public void setCodigoBanco(int codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	protected void imprimiDadosBanco() {
		System.out.println(String.format("Nome: %s",  this.getNome()));
		System.out.println(String.format("Codigo: %d",  this.getCodigoBanco()));
	}
}
