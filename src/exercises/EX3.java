package exercises;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para a tabela de multiplicação: ");
        int numero = scanner.nextInt();

        System.out.println("Tabela de Multiplicação de " + numero + ":");

        imprimirTabelaMultiplicacao(numero);

        scanner.close();
    }

    static void imprimirTabelaMultiplicacao(int numero) {
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " * " + i + " = " + resultado);
        }
    }
}
