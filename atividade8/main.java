package atividade7;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calculadora de Prestaçao");
		System.out.print("Digite o valor da prestaçao: ");
		double valor = scanner.nextDouble();
		System.out.print("Digite o valor da taxa de juros em %: ");
		double taxa = scanner.nextDouble();
		System.out.print("Digite a quantidade de dias atrasados: ");
		double diasAtrasado = scanner.nextDouble();
		
		double prestaçao = valor + (valor * (taxa / 100) * diasAtrasado);
		
		System.out.print("O valor da prestaçao em atraso é: " + prestaçao);
		
	}

}
