package Lista03;
import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("quantos alunos existem na turma ?");
        int numeroAlunos = sc.nextInt();

        int[] alunos = new int[numeroAlunos];
        double[] notas = new double[numeroAlunos];
        double somaDasNotas = 0;



        for(int i = 0; i < alunos.length; i++){
            System.out.println("digite a matricula do aluno");
            int matricula = sc.nextInt();
            System.out.println("digite a nota do aluno");
            double nota = sc.nextDouble();
            somaDasNotas += nota;
        }
        double media = somaDasNotas/numeroAlunos;
        System.out.printf("a media da turma foi: %.2f%n", media);
    }
}
