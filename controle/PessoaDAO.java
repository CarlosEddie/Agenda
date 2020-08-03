package controle;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.bd.PessoaBD;
import modelo.bd.PessoaFisicaBD;
import modelo.bd.PessoaJuridicaBD;

public class PessoaDAO implements DAO{
	static ArrayList<String> nomes = new ArrayList<String>();
	PessoaBD PBD = new PessoaBD();
	PessoaFisicaBD PFBD = new PessoaFisicaBD();
	PessoaJuridicaBD PJBD  = new PessoaJuridicaBD();
	Scanner teclado = new Scanner(System.in);
	@Override
	public void adicionarComCPF() {
		System.out.println("Digite o nome:");
		String nome = teclado.next();
		nomes.add(nome);
		System.out.println("Digite o endereço:");
		String endereco = teclado.next();
		System.out.println("Digite o CPF:");
		String documento = teclado.next();
		System.out.println("Digite o telefone");
		int telefone = Integer.valueOf(teclado.next());
		
		PFBD.adicionarPessoa("\nCPF: " + documento + "\nTelefone: " 
				+ telefone + "\nEndereço: " + endereco);
	}
	
	public void adicionarComCNPJ() {
		System.out.println("Digite o nome:");
		String nome = teclado.next();
		nomes.add(nome);
		System.out.println("Digite o endereço:");
		String endereco = teclado.next();
		System.out.println("Digite o CNPJ:");
		String documento = teclado.next();
		System.out.println("Digite o telefone");
		int telefone = Integer.valueOf(teclado.next());
		
		PJBD.adicionarPessoa("\nCNPJ: " + documento + "\nTelefone: " 
				+ telefone + "\nEndereço: " + endereco);
	}
	
	@Override
	public void buscar() {
		int res = 0;
		if(nomes == null) {
			System.out.println("Não a cadastros");
		} else {
			System.out.println("Voce quer buscar os dados de qual pessoa?");
			for(int c = 0; c < nomes.size(); c++) {
				System.out.println("[" + c + "]" + nomes.get(c));
			}
			try {
				res = Integer.valueOf(teclado.next());
			} catch (NumberFormatException exception) {
				System.err.println("Argumento inválido! Digite apenas números.");
			}
			PBD.buscar(res);
		}
		
	}

	@Override
	public void remover() {
		int res = 0;
		if(nomes == null) {
			System.out.println("Não a cadastros");
		} else {
			System.out.println("Voce quer remover os dados de qual pessoa?");
			for(int c = 0; c < nomes.size(); c++) {
				System.out.println("[" + c + "]" + nomes.get(c));
			}
			try {
				res = Integer.valueOf(teclado.next());
			} catch (NumberFormatException exception) {
				System.err.println("Argumento inválido! Digite apenas números.");
			}
			PBD.remover(res);
		}
		
	}

	@Override
	public void alterar() {
		int res = 0;
		if(nomes == null) {
			System.out.println("Não a cadastros");
		} else {
			System.out.println("Voce quer alterar os dados de qual pessoa?");
			for(int c = 0; c < nomes.size(); c++) {
				System.out.println("[" + c + "]" + nomes.get(c));
			}
			try {
				res = Integer.valueOf(teclado.next());
			} catch (NumberFormatException exception) {
				System.err.println("Argumento inválido! Digite apenas números.");
			}
			PBD.alterar(res);
		}
		
	}

}
