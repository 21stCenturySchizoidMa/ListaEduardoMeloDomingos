package LIsta01;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é a cotacao do dolar atual?");
        float cotacao = sc.nextFloat();

        System.out.println("digite o valor em dolar");
        float valorEmDolar = sc.nextFloat();

        float valorReal = valorEmDolar * cotacao;

        System.out.printf("o valor em reais é : %.2f", valorReal);

        sc.close();


    }
}
