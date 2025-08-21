package at3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double mensalidade, transporte, alimentacao, mensal, anual = 0;
		
		System.out.println("::Gastos Mensal / Anual com a Faculdade::");
		System.out.print("Digite o valor da sua mensalidade: ");
		mensalidade = scanner.nextDouble();
		
		System.out.print("Digite seu gasto com transporte: ");
		transporte = scanner.nextDouble();
		
		System.out.print("Digite seu gasto com alimentaçao: ");
		alimentacao = scanner.nextDouble();
		
		mensal = (mensalidade + transporte + alimentacao);
		anual = (mensal * 12);
		
		System.out.println("seu gasto mensal é de: " + mensal);
		System.out.print("Seu gasto anual foi de: " + anual);

	}

}
