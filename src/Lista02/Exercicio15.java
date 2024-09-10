package Lista02;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, media, notaRecuperacao;


        System.out.println("Digite o nome do aluno: ");
        String aluno = leia.nextLine();
        System.out.println("digete a primeira nota: ");
        nota1 = leia.nextDouble();
        System.out.println("digite a segunda nota: ");
        nota2 = leia.nextDouble();
        System.out.println("digite a terceira nota: ");
        nota3 = leia.nextDouble();
        System.out.println("digite a quarta nota: ");
        nota4 = leia.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("sua media foi: %.2f " , media);

        if(media >= 7) {
            System.out.println("situacao: aprovado");
        }else if(media < 7) {
            System.out.println("situacao: recuperacao");
            System.out.println("qual foi a nota da recuperacao ?");
            notaRecuperacao = leia.nextDouble();
            double mediaRecuperacao = (media + notaRecuperacao) /2 ;
            if(mediaRecuperacao >= 7) {
                System.out.println("situacao: aprovado");
                System.out.printf("sua media foi: %.2f" , mediaRecuperacao);
            }else{
                System.out.println("situacao: reprovado");
                System.out.printf("sua media foi: %.2f" , mediaRecuperacao);
            }
        }
        leia.close();
    }
}
