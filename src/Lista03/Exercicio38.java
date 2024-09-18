package Lista03;
import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String continuar;

        do{
            double E=0;
            double precoDaHora=10;
            double precoExcesso=precoDaHora*2;


            System.out.println("qual o codigo do fucionario: ");
            int C = sc.nextInt();
            System.out.println("qual foi a quantidade de horas trabalhadas: ");
            double N = sc.nextInt();

            if(N > 50){
                E = N-50;
            }
            System.out.println("\ncodigo: "+C+"\nSalario: "+(N*precoDaHora)+"\nSalario excedente: "+(E*precoExcesso)+"\nSalario total: "+(E*precoExcesso+N*precoDaHora)+"\n ");


            System.out.print("Deseja encerrar o programa? (S/N): ");
            continuar = sc.next();

        } while (!continuar.equalsIgnoreCase("S"));

        System.out.println("Programa encerrado.");
        sc.close();
    }
}
