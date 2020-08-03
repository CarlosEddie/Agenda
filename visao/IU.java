package visao;

import java.util.Scanner;

public class IU {
	static Scanner teclado = new Scanner(System.in);
	
	public static int menu() {
		int res = 0;
		System.out.println("Qual o tipo de pessoa a ser cadastrada?");
		System.out.println("[1]Pessoa Física");
		System.out.println("[2]Pessoa Juridica");
		System.out.println("[3]Sair do programa");
		try {
			res = Integer.valueOf(teclado.next());
		} catch (NumberFormatException exception) {
			System.err.println("Argumento inválido! Digite apenas números.");
		}
		return res;
	}
}
