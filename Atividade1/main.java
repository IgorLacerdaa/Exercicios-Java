package teste;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota 1: ");
		 double n1 = scanner.nextDouble();
		
		System.out.print("Digite a nota 2: ");
		 double n2 = scanner.nextDouble();
		 
		 System.out.print("Digite a nota 3: ");
		 double n3 = scanner.nextDouble();
		 
		 
		 double media = (n1 * 0.40) + (n2 * 0.40) + (n3 * 0.20);
		System.out.println("Sua nota 1 foi: " + n1);
		System.out.println("Sua nota 2 foi: " + n2);
		System.out.println("Sua nota 3 foi: " + n3);
		
		System.out.println("Sua media foi: " + media);
		if(media >= 6) {
			System.out.print("Parabens!! Voce foi aprovado");
		} else {
			System.out.print("Infelizmente voce nao foi aprovado");
		}

	}

}
