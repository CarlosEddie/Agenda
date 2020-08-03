package controle;

import java.util.Scanner;

import visao.Agenda;
import visao.IU;

public class AgendaPessoaJuridica extends Agenda{
	PessoaJuridicaDAO PJDAO = new PessoaJuridicaDAO();
	
	static Scanner teclado = new Scanner(System.in);
	
	@Override
	public void subMenu() {
		int res = 0;
		System.out.println("O que deseja fazer?");
		System.out.println("[1]Adicionar Pessoa Juridica");
		System.out.println("[2]Buscar");
		System.out.println("[3]Remover");
		System.out.println("[4]Alterar");
		System.out.println("[5]Voltar ao Menu");
		try {
			res = Integer.valueOf(teclado.next());
		} catch (NumberFormatException exception) {
			System.err.println("Argumento inválido! Digite apenas números.");
		}
		executar(res);
	}
	
	public void executar(int res) {
		switch (res) {
			case 1: {
				PJDAO.adiconarDadosPJ();
				break;
			}
			case 2: {
				PJDAO.buscarDadosPJ();
				break;
			}
			case 3: {
				PJDAO.removerDadosPJ();
				break;
			}
			case 4: {
				PJDAO.alterarDadosPJ();
				break;
			}
			default:
				IU.menu();
		}
	}
}