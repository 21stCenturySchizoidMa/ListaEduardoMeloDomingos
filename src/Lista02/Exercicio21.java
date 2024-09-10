package Lista02;
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor positivo ou negativo: ");
        double valor = sc.nextDouble();
        int sair;

            if(valor <=-1){
                System.out.println("O valor é negativo");
            }else{
                System.out.println("o valor é positivo");
            }

        System.out.println("1.sair");
            sair = sc.nextInt();

            switch (sair){
                case 1:
                    System.out.println("saindo... ");
                    System.exit(0);
                    break;
                default:
            }
        sc.close();
    }
}
