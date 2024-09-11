package Lista02;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor de A: ");
        int valorDeA = sc.nextInt();
        System.out.println("digite o valor de B: ");
        int valorDeB = sc.nextInt();

        System.out.println("estes sao os valores antes da troca:");
        System.out.println("valor de A: " + valorDeA);
        System.out.println("valor de B: " + valorDeB);
        //a funçao abaixo captura os valores das variaveis A e B e verifica se elas sao diferentes, se sim ele roda o codigo para executar a troca
        if (valorDeA != valorDeB) {
            int temp = valorDeA;
            valorDeA = valorDeB;
            valorDeB = temp;
        }
        System.out.println("estes sao os valores apos a troca");
        System.out.println("valor de A: " + valorDeA);
        System.out.println("valor de B: " + valorDeB);

        sc.close();
    }
}
