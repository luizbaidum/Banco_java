public class Executar {

	public static void main(String[] args) {
		//CRIA BANCO
		Banco Lulu = new Banco(); 
			Lulu.setNome("Banco LULU S.A.");
			Lulu.setCodigoBanco(123);
		
		//CRIA CLIENTE
		Cliente Luiz = new Cliente();
		Luiz.setNome("Luiz");
		Luiz.setCpf("000.111.222-34");
		Luiz.setIdCliente(Luiz.getIdCliente());
		Luiz.setIdade(26);
		Luiz.setRenda(2000);
		
		//CRIA CONTA CORRENTE
		Conta cc = new ContaCorrente(Luiz);
		
		//CRIA CONTA POUPANÇA
		Conta cp = new ContaPoupanca(Luiz);
				
		//CRIA CONTA DE ESTUDANTE
		Conta ce = new ContaEstudante(Luiz);
		ce.depositar(350);
		ce.transferir(100, cp);
		
		//IMPRESSÕES
		//dados banco
		System.out.println("=== Dados do banco ===");
		Lulu.imprimiDadosBanco();
		System.out.println("\n");
		
		//dados cliente
		System.out.println("=== Dados do cliente ===");
		Luiz.imprimiDadosCliente();
		System.out.println("\n");
		
		//contas
		cc.imprimirExtrato();
		System.out.println("\n");
		
		cp.imprimirExtrato();
		System.out.println("\n");
		
		ce.imprimirExtrato();
	}
}
