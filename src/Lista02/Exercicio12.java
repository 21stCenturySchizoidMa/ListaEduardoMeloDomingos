package Lista02;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero inteiro ");
        int X = sc.nextInt();

        int modulo;

        if( X >= 0){
            modulo = X;
        }else{
            modulo = X * (-1);
        }

        System.out.println("o modulo de " + X + " é: " + modulo);

        sc.close();
    }
}
