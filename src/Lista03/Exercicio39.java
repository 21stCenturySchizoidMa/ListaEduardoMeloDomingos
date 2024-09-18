package Lista03;
import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String continuar;

        do{
            System.out.println("digite um numero inteiro:");
            int num = sc.nextInt();

            if(num % 2 == 0){
                System.out.println("o numero é par");
            }else{
                System.out.println("o numero e impar");
            }

            if(num > 0){
                System.out.println("o numero é positivo");
            }else{
                System.out.println("o numero é negativo");
            }

            System.out.print("Deseja encerrar o programa? (S/N): ");
            continuar = sc.next();

        } while (!continuar.equalsIgnoreCase("S"));

        System.out.println("Programa encerrado.");
        sc.close();
    }
}
