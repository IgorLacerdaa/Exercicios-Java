package teste;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite a nota 2: ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite a nota 3: ");
        double n3 = scanner.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.println("Sua média foi: " + media);
    }
}
