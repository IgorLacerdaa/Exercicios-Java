package atividade10;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("::Calculador de media::");
		System.out.print("Digite a nota da Avaliaçao 1: ");
		double av1 = scanner.nextDouble();
		System.out.print("Digite a nota das atividades EAD: ");
		double ead1 = scanner.nextDouble();
		System.out.print("Digite a nota das Atividades: ");
		double at1 = scanner.nextDouble();
		
		double np1 = (av1 * 0.60) + (ead1 * 0.20) + (at1 * 0.20);
		
		System.out.println("A nota da sua np1 foi: " + np1);
		
		System.out.print("Digite a nota das Atividades 2: ");
		double at2 = scanner.nextDouble();
		System.out.print("Digite a nota das atividades EAD 2: ");
		double ead2 = scanner.nextDouble();
		System.out.print("Digite a nota da pluri: ");
		double pluri = scanner.nextDouble();
		System.out.print("Digite a nota da avaliaçao 2: ");
		double av2 = scanner.nextDouble();
		
		double np2 = (at2 * 0.20) + (ead2 * 0.20) + (pluri * 0.20) + (av2 * 0.40);
		
		System.out.println("Sua nota da np2 foi: " + np2);
		
		double mediaFinal = (Math.round (((np1 * 0.40) + (np2 * 0.60)) *100) / 100.0);
		System.out.print("Sua nota final é: " + mediaFinal);
	}
}
