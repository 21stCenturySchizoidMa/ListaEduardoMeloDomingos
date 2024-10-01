package Lista04;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um texto");
        String texto = sc.nextLine();

        String ignorarEspaco = texto.replace(" ","");
        int caracetere = ignorarEspaco.length();

        System.out.println("tem " + caracetere + " caracteres");

        String[] palavras = texto.trim().split("\\s+");
        int quantidadeDePalavras  = palavras.length;

        System.out.println("a quantidade de palavras é " + quantidadeDePalavras);




    }
}
