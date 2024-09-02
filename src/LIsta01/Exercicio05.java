package LIsta01;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("qual foi o tempo da viagem ? ");
        float tempo = sc.nextFloat();
        System.out.println("qual foi a velocidade media em km/h");
        float velocidadeMedia = sc.nextFloat();

        double distanciaPercorrida = tempo * velocidadeMedia;
        double litrosUsados = distanciaPercorrida / 12;

        System.out.printf("velocidadeMedia: %.2f km/h%n ", velocidadeMedia );
        System.out.printf("tempo: %.2f%n ", tempo);
        System.out.printf("distancia: %.2f%n ", distanciaPercorrida);
        System.out.printf("quantidade de litros gastos: %.2f%n ", litrosUsados);

        sc.close();

    }
}
