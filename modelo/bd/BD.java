package modelo.bd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public abstract class BD {
	private static Map<Integer, String> contatos = new HashMap<Integer, String>();
	
	public String buscarPessoa(int p) {
		return contatos.get(p);
	}
	
	public boolean adicionarPessoa(String p) {
		int key = 0; 
		if(contatos == null)
			contatos.put(key, p);
		else {
			key = contatos.size();
			contatos.put(key, p);
		}
		if(contatos == null || contatos.size() == key) {
			return false;
		} else {
			System.out.println("Adicionado com sucesso");
			return true;
		}
		
	}
	
	public boolean removerPessoa(int p) {
		int key = contatos.size();
		contatos.remove(p);
		if(key == contatos.size() + 1) {
			System.out.println("Removido com sucesso");
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean alterarPessoa(int p) {
		int res = 0;
		String novaDesc;
		Scanner teclado = new Scanner(System.in);
		contatos.remove(p);
		System.out.println("Qual o novo tipo de pessoa?");
		System.out.println("[1]Pessoa Física");
		System.out.println("[2]Pessoa Juridica");
		try {
			res = Integer.valueOf(teclado.next());
		} catch (NumberFormatException exception) {
			System.err.println("Argumento inválido! Digite apenas números.");
		}
		if(res == 1) {
			System.out.println("Digite o endereço:");
			String endereco = teclado.next();
			System.out.println("Digite o CPF:");
			String documento = teclado.next();
			System.out.println("Digite o telefone");
			int telefone = Integer.valueOf(teclado.next());
			
			novaDesc = ("\nCPF: " + documento + "\nTelefone: " 
					+ telefone + "\nEndereço: " + endereco);
			contatos.put(p, novaDesc);
		} else {
			System.out.println("Digite o endereço:");
			String endereco = teclado.next();
			System.out.println("Digite o CNPJ:");
			String documento = teclado.next();
			System.out.println("Digite o telefone");
			int telefone = Integer.valueOf(teclado.next());
			
			novaDesc = ("\nCPF: " + documento + "\nTelefone: " 
					+ telefone + "\nEndereço: " + endereco);
			contatos.put(p, novaDesc);
		}
		
		if(contatos.get(p) == novaDesc) {
			System.out.println("alterado com sucesso");
			return true;
		} else {
			return false;
		}
	}
}
