package Lista03;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 10;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;


        for (int i = 0; i < num; i++) {
            System.out.println("Digite um valor:");
            int valor = sc.nextInt();


            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }


            soma += valor;
        }


        double media = (double) soma / num;

        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
        System.out.println("a média dos valores é: " + media);
    }
}
