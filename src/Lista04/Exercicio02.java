package Lista04;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um valor inteiro:");
        int num = sc.nextInt();

        int modulo;

        String[] digitos ={
                "zero","um","dois","tres","quatro","cinco","seis","sete","oito","nove"
        };

        if(num < 0){
            modulo = num  * (-1);
        }

        String conversor = String.valueOf(num);

        for(int i = 0; i < conversor.length(); i++){
            char caracter = conversor.charAt(i);
            System.out.println(digitos[Character.getNumericValue(caracter)]);
        }
    }
}
