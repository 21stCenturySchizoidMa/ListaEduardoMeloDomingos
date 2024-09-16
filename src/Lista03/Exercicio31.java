package Lista03;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, par = 0, impar = 0;

        do {
            System.out.println("digite um numero positivo: ");
            num = sc.nextInt();
            System.out.println("obs: numeros negativos encerram o programa!");
            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }

        } while (num >= 0);
        System.out.println("\n\nQuantidade de Números Pares: "+par+"\nQuantidade de Números Impares: "+impar);
    }
}
