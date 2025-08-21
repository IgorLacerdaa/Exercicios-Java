package Atividade5;

import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double salarioBruto, salarioLiquido, salarioAcrescimo, aulasMes = 0;
		double acrescimo = 1.10;
		double valorAula = 25.00; 
		int aulas = 0;
		double IR, INSS = 0;
		
		System.out.println("::Holerite::");
		System.out.print("Digite a quantidade de aulas semanais lecionadas: ");
		aulas = scanner.nextInt();
		
		aulasMes = (aulas * valorAula) * 4;
		salarioBruto = aulasMes * acrescimo;
		
		IR = salarioBruto * 0.05;
		INSS = salarioBruto * 0.07;
		salarioLiquido = (salarioBruto - IR - INSS);

		
		
		System.out.println("Valor recebido R$" + aulasMes);
		System.out.println("Salario Bruto R$" + salarioBruto);
		System.out.println("Desconto IR R$" + IR);
		System.out.println("Desconto INSS R$" + INSS);
		System.out.println("Salario Liquido R$" + salarioLiquido);

	}

}
