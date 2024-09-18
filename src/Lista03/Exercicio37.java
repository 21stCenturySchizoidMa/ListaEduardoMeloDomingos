package Lista03;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String continuar;


        do {
            System.out.println("escolha uma das opcoes:");
            System.out.println("1.soma:");
            System.out.println("2.subtracao:");
            System.out.println("3.multiplicacao:");
            System.out.println("4.divisao:");
            System.out.println("informe a opcao!");
            int opcao = sc.nextInt();

            boolean sair=true;

            switch (opcao) {
                case 1:
                    System.out.println("soma");
                    System.out.println("digite um valor");
                    double valor1 = sc.nextDouble();
                    System.out.println("digite um valor");
                    double valor2 = sc.nextDouble();

                    double soma = valor1 + valor2;
                    System.out.println("o resultado é: " + soma);
                    break;
                case 2:
                    System.out.println("subtracao");
                    System.out.println("digite um valor");
                    double valor3 = sc.nextDouble();
                    System.out.println("digite um valor");
                    double valor4 = sc.nextDouble();


                    double subtracao = valor3 - valor4;
                    System.out.println("o resultado é: " + subtracao);
                    break;
                case 3:
                    System.out.println("multiplicacao");
                    System.out.println("digite um valor");
                    double valor5 = sc.nextDouble();
                    System.out.println("digite um valor");
                    double valor6 = sc.nextDouble();

                    double multiplicacao = valor5 * valor6;
                    System.out.println("o resultado é " + multiplicacao);
                    break;
                case 4:
                    System.out.println("divisao");
                    System.out.println("digite um valor");
                    double valor7 = sc.nextDouble();
                    System.out.println("digite um valor");
                    double valor8 = sc.nextDouble();

                    double divisao = valor7 / valor8;
                    System.out.println("o resultado é: " + divisao);
                    break;
                default:
                    System.out.println("opcao invalida");
                    sair=false;
                    break;
            }

            if(sair) {
                System.out.println("deseja continuar ?(s/n)");
                continuar = sc.next();
            }else{
                continuar = "n";
            }

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("vc saiu do programa");
        sc.close();
    }
}
