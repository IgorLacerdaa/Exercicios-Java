package Atividade6;

import java.util.Scanner;

public class m {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" ::Conversor de temperaturas:: ");
		System.out.print("Digite a temperatura: ");
		int celsius = scanner.nextInt();
		
		double fahrenheit = (celsius * 1.8) + 32;
		
		System.out.print("A temperatura convertida para Fahrenheit é " + fahrenheit);

	}

}
