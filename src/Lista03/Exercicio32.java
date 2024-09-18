package Lista03;
import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num,resultado=0;
        int contador=0;

        do{
            System.out.println("digite um numero inteiro positivo menor que 0 e maior que 10: ");
            num = sc.nextInt();
        }while(num <= 0 || num >= 10);

        for(int i = num; contador < 20 ; i++){
            if(i % 2 !=0){
                resultado += i * i;
                contador++;
            }
        }
        System.out.println("a soma dos quadrados dos primeiros 20 numeros impares é: "+resultado);

    }

}
