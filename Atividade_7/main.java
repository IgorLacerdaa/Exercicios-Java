package atividade7;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("::Volume lata de oleo::");
	System.out.print("Digite o raio da lata de oleo: ");
	double raio = scanner.nextDouble();
	System.out.print("Digite a altura da lata de oleo: ");
	double altura = scanner.nextDouble();
	
	double volume = (raio * raio) * 3.14 * altura;
	
	System.out.print("O volume da lata de oleo é aproximadamente: " + volume);
	
	}

}
