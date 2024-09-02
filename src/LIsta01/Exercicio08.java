package LIsta01;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o raio da lata de oleo: ");
        double R = sc.nextDouble();
        System.out.println("digite o altura da lata de oleo: ");
        double A = sc.nextDouble();

        double V =  3.14159 * R * R * A;
        System.out.println("o volume da lata de oleo %.2f: " + V);
    }
}
