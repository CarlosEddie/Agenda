package modelo.bd;

public class PessoaBD extends BD{
	
	public void buscar(int p) {
		System.out.println(buscarPessoa(p));
	}
	
	public void remover(int p) {
		removerPessoa(p);
	}
	
	public void alterar(int p) {
		alterarPessoa(p);
	}
	
}
