package LIsta01;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("quantidade minina no estoque");
        int quantidadeMinima = sc.nextInt();

        System.out.println("quantidade maxima no estoque");
        int quantidadeMaxima = sc.nextInt();

        int estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;
        System.out.println("Quantidade de estoque: " + estoqueMedio);

        sc.close();
    }
}
