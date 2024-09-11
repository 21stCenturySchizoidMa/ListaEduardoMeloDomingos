package Lista02;
import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe sua altura: ");
        double H = sc.nextDouble();
        System.out.println("informe seu sexo(use apenas M,m ou F,f): ");
        char sexo = sc.next().charAt(0);

        if(sexo == 'M' || sexo == 'm'){
            double pesoIdeal = (72.7*H) - 58;
            System.out.printf("seu peso ideal é: %.2f" , pesoIdeal);
        }else if(sexo == 'F' || sexo == 'f'){
            double pesoIdeal = (62.1*H) - 44.7;
            System.out.printf("seu peso ideal é : %.2f" , pesoIdeal);
        }

    }
}
