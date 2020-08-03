import controle.AgendaPessoaFisica;
import controle.AgendaPessoaJuridica;
import visao.IU;

public class Main {
	public static void main(String[] args) {
		AgendaPessoaFisica APF = new AgendaPessoaFisica();
		AgendaPessoaJuridica APJ = new AgendaPessoaJuridica();
		while(true) {
			int tipo = IU.menu();
			switch (tipo) {
				case 1: {
					APF.subMenu();
					break;
				}
				case 2: {
					APJ.subMenu();
					break;
				}
			}
			if (tipo == 3) {
				break;
			}
		}
	}
}
