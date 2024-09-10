package Lista02;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um codigo entre 1 e 3: ");
        int codigo = sc.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("um");
                break;
            case 2:
                System.out.println("dois");
                break;
            case 3:
                System.out.println("tres");
                break;
            default:
                System.out.println("codigo invalido");
                break;
        }
        sc.close();
    }
}
