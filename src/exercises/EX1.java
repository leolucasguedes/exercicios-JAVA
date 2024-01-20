package exercises;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        String par;
        String positivo = " ";

        if (numero % 2 == 0) {
            par = "par";
        } else {
            par = "ímpar";
        }

        if (numero > 0) {
            positivo = "positivo";
        } else if (numero < 0) {
            positivo = "negativo";
        } else {
            System.out.println("O número é zero.");
        }

        System.out.println(numero + " é " + par + " e " + positivo);

        scanner.close();
    }
}