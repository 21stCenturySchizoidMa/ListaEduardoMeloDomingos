package LIsta01;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira sua idade em anos: ");
        int idadeAnos = sc.nextInt();

        int idadeDias = idadeAnos * 365;
        System.out.println("sua idade em dias é " + idadeDias);

        sc.close();
    }
}
