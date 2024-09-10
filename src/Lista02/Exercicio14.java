package Lista02;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero: ");
        double numA = sc.nextDouble();
        System.out.println("digite um  segundo numero: ");
        double numB = sc.nextDouble();

        double maior,menor;

        if(numA > numB){
            maior = numA;
            menor = numB;
        }else{
            maior = numB;
            menor = numA;
        }

        double diferenca = maior-menor;

        System.out.printf("a diferenca é: %.2f" , diferenca);

        sc.close();
    }
}
