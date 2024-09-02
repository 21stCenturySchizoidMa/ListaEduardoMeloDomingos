package LIsta01;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vendedor01 = "joao";
        String vendedor02 = "maria";
        String vendedor03 = "vitor";
        String vendedor04 = "jose";

        System.out.println(vendedor01);
        System.out.println(vendedor02);
        System.out.println(vendedor03);
        System.out.println(vendedor04);
        System.out.println("Quem vendeu a peça?");

        String vendedor = sc.nextLine();
        System.out.println("qual codigo da peca ?");
        int codigo = sc.nextInt();
        System.out.println("preco da peca ?");
        float preco = sc.nextFloat();
        System.out.println("quantidades vendidas ?");
        int vendas = sc.nextInt();

        double totalDaVendas = preco * vendas;
        double comissao = totalDaVendas * 0.05;

        System.out.printf("Total da Venda: R$ %.2f%n", totalDaVendas);
        System.out.printf("Comissão do Vendedor: R$ %.2f%n", comissao);

        sc.close();

    }
}

