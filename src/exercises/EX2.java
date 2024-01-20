package exercises;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da sequência de Fibonacci: ");
        int tamanho = scanner.nextInt();

        System.out.print("Sequência de Fibonacci de tamanho " + tamanho + ": ");
        imprimirSequenciaFibonacci(tamanho);

        scanner.close();
    }

    static void imprimirSequenciaFibonacci(int tamanho) {
        int primeiroTermo = 0, segundoTermo = 1;

        for (int i = 0; i < tamanho; i++) {
            System.out.print(primeiroTermo + " ");

            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

    }
}
