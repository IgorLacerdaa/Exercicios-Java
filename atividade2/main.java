package atividade2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int anoNascimento, anoAtual, dias = 0;
		
		System.out.print("Digite o ano que voce nasceu: ");
		anoNascimento = scanner.nextInt();
		
		System.out.print("Digite o ano atual: ");
		anoAtual = scanner.nextInt();
		
		dias = (anoAtual - anoNascimento) * 365;
		
		System.out.print("Voce viveu aproximadamente " + dias + " dias");

	}

}
