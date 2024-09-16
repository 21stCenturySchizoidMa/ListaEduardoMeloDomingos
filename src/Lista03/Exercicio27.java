package Lista03;
import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite a quantidade de numeros a serem fatorados:");
        int quantidade = sc.nextInt();

        long[] numeros = new long[quantidade];


        for(int quantidadeX=0; quantidadeX < numeros.length; quantidadeX++){
            System.out.println("digite o numero a ser fatorado");
            numeros[quantidadeX] = sc.nextLong();
        }

        for(int i =0; i < numeros.length; i++){
            long resultado=1;
            for(long x = numeros[i]; x > 0; x--){
                resultado = resultado*x;
            }
            System.out.println("o fatorial de: " + numeros[i] + " é " + resultado);
        }

    }

}


