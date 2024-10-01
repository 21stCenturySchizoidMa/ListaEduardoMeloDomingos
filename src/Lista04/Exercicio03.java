package Lista04;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite seu nome");
        String nome = sc.nextLine();

        String[] ignorar = {
                "do", "da", "dos", "das", "de", "di", "du","e"
        };
        String[] palavras = nome.split(" ");
        StringBuilder abreviacao = new StringBuilder();

        for(String palavra : palavras) {
            boolean ignorarPreposicao = false;
            for(String preposicao : ignorar) {
                if(palavra.equalsIgnoreCase(preposicao)) {
                    ignorarPreposicao = true;
                    break;
                }

            }
            if(!ignorarPreposicao && !palavra.isEmpty()){
                abreviacao.append(palavra.charAt(0));
            }
        }

        System.out.println("abreviacao " + abreviacao.toString().toUpperCase());

    }
}
