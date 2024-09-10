package Lista02;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero");
        int numA = sc.nextInt();
        System.out.println("digite um numero");
        int numB = sc.nextInt();

        if (numA > numB) {
            System.out.println("o maior numero é: " + numA);
        } else if (numA < numB) {
            System.out.println("o maior numero é: " + numB);
        }else{
            System.out.println("os numeros sao iguais!");
        }
    }
}
