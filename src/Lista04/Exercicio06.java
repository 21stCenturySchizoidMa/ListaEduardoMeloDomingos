package Lista04;

import java.util.Random;

public class Exercicio06 {
    public static void main(String[] args) {

        String s1 = "ATGCCGTA";
        String s2 = "TAGACGTA";

        String[] filhosGerados = operacaoGenetica.recombinacao(s1, s2);
        System.out.println("primeiro filho " + filhosGerados[0] );
        System.out.println("segundo filho " + filhosGerados[1] );

        String filhoMutado = operacaoGenetica.mutacao(filhosGerados[0]);
        System.out.println("um dos filhos mutados " + filhoMutado);
    }
    public static class operacaoGenetica{

        public static String[] recombinacao (String s1, String s2){

            Random aleatorio = new Random();
            int cortar = aleatorio.nextInt(s1.length());

            String s3 = s1.substring(0, cortar) + s2.substring(cortar);
            String s4 = s2.substring(0, cortar) + s1.substring(cortar);

            return new String[]{s3, s4};

        }

        public static String mutacao (String s3){

            Random aleatorio = new Random();
            int mutar = aleatorio.nextInt(s3.length());
            char[] codigoGenetico = s3.toCharArray();
            char novoCodigo = (char) ('A' + aleatorio.nextInt(4));

            do{
                novoCodigo = (char) ('A' + aleatorio.nextInt(4));
            }while(codigoGenetico[mutar] == novoCodigo);

            codigoGenetico[mutar] = novoCodigo;
            return new String(codigoGenetico);


        }



    }
}
