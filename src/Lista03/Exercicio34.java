package Lista03;
import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero positivo(digitar um numero negativo encerra o programa: ");
        int num = sc.nextInt();

        int maior=num;
        int menor=num;

            do{
                if(num > 0){
                    maior = Math.max(maior, num);
                    menor = Math.min(menor, num);
                    System.out.println("digite outro numero: ");
                    num = sc.nextInt();
                }
            }while(num > 0);

        System.out.println("o maior numero foi: "+maior);
        System.out.println("o menor numero foi: "+menor);



    }
}
