package controle;

public class PessoaJuridicaDAO extends PessoaDAO{
	public void adiconarDadosPJ() {
		System.out.println("Insira os dados equivalentes a pessoa juridica");
		adicionarComCNPJ();
	}
	
	public void buscarDadosPJ() {
		System.out.println("Insira os dados equivalentes a pessoa juridica");
		buscar();
	}
	
	public void removerDadosPJ() {
		System.out.println("Insira os dados equivalentes a pessoa juridica");
		remover();
	}
	
	public void alterarDadosPJ() {
		System.out.println("Insira os dados equivalentes a pessoa juridica");
		alterar();
	}
	
}
