package Lista04;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um texto:");
        String texto = sc.nextLine();

        String[] palavras = texto.trim().split("\\s+");
        String textoRefetio = String.join(" ", palavras);

        System.out.println("o seu texto foi: " + textoRefetio);


    }


}
