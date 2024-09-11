package Lista02;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int num1 = sc.nextInt();
        System.out.println("Digite outro numero inteiro: ");
        int num2 = sc.nextInt();

        int menu;


        System.out.println("1.Verificar se um dos números lidos é ou não múltiplo do outro:");
        System.out.println("2.Verificar se os dois números lidos são pares:");
        System.out.println("3.Verificar se a média dos dois números é maior ou igual a 7:");
        System.out.println("4.sair:");
        System.out.println("escolha uma das opçoes acima");
        menu = sc.nextInt();

        switch (menu) {
            case 1:
                System.out.println("1.verificar se é mutiplo ou nao:");
                if (num1 % num2 == 0) {
                    System.out.println(num1 + " é mutiplo de " + num2);
                } else if (num2 % num1 == 0) {
                    System.out.println(num2 + " é mutiplo de " + num1);
                } else {
                    System.out.println("os numeros inseridos nao sao mutiplos");

                }
                break;
            case 2:
                System.out.println("2.Verificar se os dois números lidos são pares:");
                if (num1 % 2 == 0 && num2 % 2 == 0) {
                    System.out.println("os dois numeros sao pares");
                } else if (num1 % 2 == 0 && num2 % 2 > 0) {
                    System.out.println("somente " + num1 + "é par");
                } else if (num2 % 2 == 0 && num1 % 2 > 0) {
                    System.out.println("somente " + num2 + " é par");
                } else {
                    System.out.println("os numeros inseridos nao sao pares");
                }
                break;
            case 3:
                System.out.println("3.Verificar se a média dos dois números é maior ou igual a 7:");
                int media = (num1 + num2) / 2;
                if (media > 7) {
                    System.out.println("a media é maior que 7, a media é " + media);
                } else if (media == 7) {
                    System.out.println("a media é igual a 7, a media é " + media);
                } else {
                    System.out.println("a media nao é maior nem igual a 7");
                }
                break;
            case 4:
                System.out.println("saindo...");
                System.exit(0);
                break;
            default:
        }
    }
}
