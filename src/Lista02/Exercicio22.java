package Lista02;
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valor = sc.nextDouble();

        double positivo;
        double negativo;

            if (valor < 0){
                negativo = valor;
                System.out.println("o valor é negativo " + valor);
            }else{
                positivo = valor;
                System.out.println("o valor é positivo " + valor);
            }
    }
}
