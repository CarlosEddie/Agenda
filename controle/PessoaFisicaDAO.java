package controle;

public class PessoaFisicaDAO extends PessoaDAO{
	public void adiconarDadosPF() {
		System.out.println("Insira os dados equivalentes a pessoa f�sica a se adicionar");
		adicionarComCPF();
	}
	
	public void buscarDadosPF() {
		System.out.println("Insira os dados equivalentes a pessoa f�sica que se deseja buscar");
		buscar();
	}
	
	public void removerDadosPF() {
		System.out.println("Insira os dados equivalentes a pessoa f�sica a ser removida");
		remover();
	}
	
	public void alterarDadosPF() {
		System.out.println("Insira os dados equivalentes a pessoa f�sica a ser alterada");
		alterar();
	}
	
}
