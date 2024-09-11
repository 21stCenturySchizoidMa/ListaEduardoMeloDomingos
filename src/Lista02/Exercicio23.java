package Lista02;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;

        System.out.println("MENU DE OPCOES");
        System.out.println("1.soma: ");
        System.out.println("2.mutiplicacao: ");
        System.out.println("3.divisao: ");
        System.out.println("4.subtracao: ");

        System.out.println("digite uma opcao");
        menu = sc.nextInt();
        //switch case com 4 operaçoes matematicas basicas, onde cada case fuciona separadamente da outra com comandos e funçoes proprias
        switch (menu) {
            case 1:
                System.out.println("1.soma");
                System.out.println("digite o primeiro numero da soma");
                double num1 = sc.nextDouble();
                System.out.println("digite o segundo numero da soma");
                double num2 = sc.nextDouble();

                double soma = num1 + num2;

                System.out.printf("Resultado: %.2f", soma);
                break;
            case 2:
                System.out.println("2.mutiplicacao");
                System.out.println("digite o primeiro numero da mutiplicacao");
                double num3 = sc.nextDouble();
                System.out.println("digite o segundo numero da mutiplicacao");
                double num4 = sc.nextDouble();

                double mutiplicacao = num3 * num4;

                System.out.printf("Resultado: %.2f", mutiplicacao);
                break;
            case 3:
                System.out.println("3.divisao");
                System.out.println("digite o primeiro numero da divisao");
                double num5 = sc.nextDouble();
                System.out.println("digite o segundo numero da divisao");
                double num6 = sc.nextDouble();

                double divisao = num5 / num6;

                System.out.printf("Resultado: %.2f", divisao);
                break;
            case 4:
                System.out.println("4.subtracao");
                System.out.println("digite o primeiro numero da subtracao");
                double num7 = sc.nextDouble();
                System.out.println("digite o segundo numero da subtracao");
                double num8 = sc.nextDouble();

                double subtracao = num7 - num8;

                System.out.printf("Resultado: %.2f", subtracao);
                break;
            default:
        }
        sc.close();
    }
}
