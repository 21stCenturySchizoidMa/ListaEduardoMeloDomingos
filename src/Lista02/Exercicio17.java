package Lista02;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numInteiro = sc.nextInt();

            if(numInteiro > 9 || numInteiro < 0){
                System.out.println("valor invalido");
            }else{
                System.out.println("valor valido");
            }
            sc.close();
    }
}
