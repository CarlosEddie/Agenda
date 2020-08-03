package controle;

import java.util.Scanner;
import visao.Agenda;
import visao.IU;

public class AgendaPessoaFisica extends Agenda{
	PessoaFisicaDAO PFDAO = new PessoaFisicaDAO();
	static Scanner teclado = new Scanner(System.in);
	
	@Override
	public void subMenu() {
		int res = 0;
		System.out.println("O que deseja fazer?");
		System.out.println("[1]Adicionar Pessoa F�sica");
		System.out.println("[2]Buscar");
		System.out.println("[3]Remover");
		System.out.println("[4]Alterar");
		System.out.println("[5]Voltar ao Menu");
		try {
			res = Integer.valueOf(teclado.next());
		} catch (NumberFormatException exception) {
			System.err.println("Argumento inv�lido! Digite apenas n�meros.");
		}
		executar(res);
	}
	
	public void executar(int res) {
		switch (res) {
			case 1: {
				PFDAO.adiconarDadosPF();
				break;
			}
			case 2: {
				PFDAO.buscarDadosPF();
				break;
			}
			case 3: {
				PFDAO.removerDadosPF();
				break;
			}
			case 4: {
				PFDAO.alterarDadosPF();
				break;
			}
			default:
				IU.menu();
		}
	}
}
