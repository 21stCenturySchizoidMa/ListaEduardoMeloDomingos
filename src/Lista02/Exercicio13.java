package Lista02;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um valor inteiro: ");
        int numA = sc.nextInt();
        System.out.println("digite um valor inteiro: ");
        int numB = sc.nextInt();
        System.out.println("digite um valor inteiro: ");
        int numC = sc.nextInt();

        int primeiro,segundo,terceiro;

        if(numA >= numB && numA >= numC){
            primeiro = numA;
            if(numB >= numC){
                segundo = numB;
                terceiro = numC;
            }else{
                segundo = numC;
                terceiro = numA;
            }
        } else if (numB >= numA && numB >= numC) {
            primeiro = numB;
            if(numA >= numC){
                segundo = numA;
                terceiro = numC;
            }else {
                segundo = numC;
                terceiro = numA;
            }
        }else {
            primeiro = numC;
            if(numA >= numB){
                segundo = numA;
                terceiro = numB;
            }else {
                segundo = numB;
                terceiro = numA;
            }
        }
        System.out.println(primeiro);
        System.out.println(segundo);
        System.out.println(terceiro);
    }
}
