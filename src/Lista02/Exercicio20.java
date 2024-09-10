package Lista02;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor A ");
        int a = sc.nextInt();
        System.out.println("Digite o valor B ");
        int b = sc.nextInt();
        System.out.println("Digite o valor C ");
        int c = sc.nextInt();

        int maior = Math.max(a, Math.max(b, c));
        int menor = Math.min(a, Math.min(b, c));

        int menorValor = menor * maior;
        int maiorValor = maior/menor;

        boolean condicao = a > 0;
        boolean condicao2 = b > 0;
        boolean condicao3 = c > 0;

            if (condicao) {
                System.out.println("menor valor: " + menorValor);
                System.out.println("maior valor: " + maiorValor);
            }else{
                System.out.println("valor digitado nao é valido ");
        }
    }
}
