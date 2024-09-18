package Lista03;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {

            System.out.println("Escolha uma opção:");
            System.out.println("1 - Conversão de Graus Celsius em Graus Fahrenheit");
            System.out.println("2 - Conversão de Graus Fahrenheit em Graus Celsius");
            System.out.println("3 - Peso ideal do homem");
            System.out.println("4 - Peso ideal da mulher");
            System.out.print("Digite a opção desejada (1/2/3/4): ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:

                    System.out.print("Digite a temperatura em graus Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = (celsius * 9/5) + 32;
                    System.out.printf("Temperatura em graus Fahrenheit: %.2f%n", fahrenheit);
                    break;

                case 2:

                    System.out.print("Digite a temperatura em graus Fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    celsius = (fahrenheit - 32) * 5/9;
                    System.out.printf("Temperatura em graus Celsius: %.2f%n", celsius);
                    break;

                case 3:

                    System.out.print("Digite sua altura em metros: ");
                    double altura = scanner.nextDouble();
                    double pesoIdealHomem = 72.7 * altura - 58;
                    System.out.printf("Peso ideal para um homem com %.2f metros de altura: %.2f kg%n", altura, pesoIdealHomem);
                    System.out.print("Digite seu peso atual em kg: ");
                    double pesoAtualHomem = scanner.nextDouble();
                    if (pesoAtualHomem > pesoIdealHomem) {
                        System.out.printf("Você está acima do peso ideal em %.2f kg.%n", pesoAtualHomem - pesoIdealHomem);
                    } else if (pesoAtualHomem < pesoIdealHomem) {
                        System.out.printf("Você está abaixo do peso ideal em %.2f kg.%n", pesoIdealHomem - pesoAtualHomem);
                    } else {
                        System.out.println("Você está no peso ideal.");
                    }
                    break;

                case 4:

                    System.out.print("Digite sua altura em metros: ");
                    altura = scanner.nextDouble();
                    double pesoIdealMulher = 62.1 * altura - 44.7;
                    System.out.printf("Peso ideal para uma mulher com %.2f metros de altura: %.2f kg%n", altura, pesoIdealMulher);
                    System.out.print("Digite seu peso atual em kg: ");
                    double pesoAtualMulher = scanner.nextDouble();
                    if (pesoAtualMulher > pesoIdealMulher) {
                        System.out.printf("Você está acima do peso ideal em %.2f kg.%n", pesoAtualMulher - pesoIdealMulher);
                    } else if (pesoAtualMulher < pesoIdealMulher) {
                        System.out.printf("Você está abaixo do peso ideal em %.2f kg.%n", pesoIdealMulher - pesoAtualMulher);
                    } else {
                        System.out.println("Você está no peso ideal.");
                    }
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }


            System.out.print("Deseja encerrar o programa? (S/N): ");
            char resposta = scanner.next().charAt(0);

            if (resposta == 'S' || resposta == 's') {
                continuar = false;
                System.out.println("Programa encerrado.");
            }
        }

        scanner.close();
    }
}

