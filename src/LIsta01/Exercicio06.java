package LIsta01;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma temperatura em graus celcius: ");
        double C = sc.nextDouble();

        float F = (float) (9 * C + 160 ) /5;

        System.out.printf("a temperatura em Fahrenheit é: %.2f°F%n ", F);
    }
}
