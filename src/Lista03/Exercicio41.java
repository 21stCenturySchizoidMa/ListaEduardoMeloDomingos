package Lista03;

import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {

            System.out.print("Digite a idade do nadador: ");
            int idade = scanner.nextInt();


            if (idade >= 5 && idade <= 7) {
                System.out.println("Categoria: Infantil A");
            } else if (idade >= 8 && idade <= 11) {
                System.out.println("Categoria: Infantil B");
            } else if (idade >= 12 && idade <= 13) {
                System.out.println("Categoria: Juvenil A");
            } else if (idade >= 14 && idade <= 17) {
                System.out.println("Categoria: Juvenil B");
            } else if (idade >= 18) {
                System.out.println("Categoria: Adultos");
            } else {
                System.out.println("Idade fora do intervalo de categorias.");
            }


            System.out.print("Deseja classificar outro nadador? (s/n): ");
            char resposta = scanner.next().charAt(0);


            if (resposta != 's' && resposta != 'S') {
                continuar = false;
                System.out.println("Programa encerrado.");
            }
        }

        scanner.close();
    }
}

