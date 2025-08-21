package Atividade4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double area, raio = 0;
		double pi = 3.14;
		
		System.out.print("Digite o raio da circunferencia: ");
		raio = scanner.nextDouble();
		
		area = (raio * raio * pi);
		
		System.out.print("A area dessa circunferencia é aproximadamente: " + area);

	}

}
