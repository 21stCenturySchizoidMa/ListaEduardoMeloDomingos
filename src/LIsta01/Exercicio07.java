package LIsta01;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma temperatura em graus  Fahrenheit: ");
        double F = sc.nextDouble();

        double C = (F - 32) * 5 / 9;

        System.out.printf("a temperatura em celcius é: %.2f°C%n ", C);
    }
}

