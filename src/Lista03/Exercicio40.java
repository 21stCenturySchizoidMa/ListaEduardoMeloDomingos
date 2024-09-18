package Lista03;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {

            System.out.print("Digite o índice de poluição (entre 0.0 e 1.0): ");
            double indicePoluicao = sc.nextDouble();

            if (indicePoluicao >= 0.05 && indicePoluicao <= 0.25) {
                System.out.println("Índice de poluição está dentro dos limites aceitáveis.");
            } else if (indicePoluicao >= 0.3 && indicePoluicao < 0.4) {
                System.out.println("Indústrias do 1º grupo devem suspender suas atividades.");
            } else if (indicePoluicao >= 0.4 && indicePoluicao < 0.5) {
                System.out.println("Indústrias do 1º e 2º grupo devem suspender suas atividades.");
            } else if (indicePoluicao >= 0.5) {
                System.out.println("Todos os grupos de indústrias devem suspender suas atividades.");
            } else {
                System.out.println("Índice de poluição inválido. Deve ser maior que 0.0 e menor ou igual a 1.0.");
            }


            System.out.print("Deseja encerrar o programa? (S/N): ");
            continuar = sc.next();

        } while (!continuar.equalsIgnoreCase("S"));

        System.out.println("Programa encerrado.");
        sc.close();
    }
}
