package Lista03;
import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o numero que deseja saber a tabuada");
        double num = sc.nextDouble();

        for(int i = 0; i <= 10; i++){
            System.out.println("a tabuada de " + num + " é ");
            System.out.printf("%.0f x %d = %.0f\n", num, i, num * i);
    }
    }
}
