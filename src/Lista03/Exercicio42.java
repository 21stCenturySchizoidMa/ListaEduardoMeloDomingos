package Lista03;

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Digite um número (0 para parar): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }


            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }


        if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
            System.out.println("Nenhum número válido foi inserido.");
        } else {
            System.out.println("O maior número é: " + maior);
            System.out.println("O menor número é: " + menor);
        }

        scanner.close();
    }
}
