package atividade8;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("::Conversor de Moedas::");
		System.out.print("Digite o saldo em reais: ");
		double reais = scanner.nextDouble();
		
		double dolar = reais * 5.40;
		double euro = reais * 6.32;
		
		System.out.println("Seu saldo em Reias é de R$" + reais);
		System.out.println("Seu saldo em Dolar é de U$" + dolar);
		System.out.println("Seu saldo em Euros é de " + euro + " EUR");

	}

}
