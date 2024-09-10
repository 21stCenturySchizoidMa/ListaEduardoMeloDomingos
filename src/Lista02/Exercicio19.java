package Lista02;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o valor dos lados do triangulo: ");

        System.out.println("lado A");
        double A = sc.nextDouble();
        System.out.println("lado B");
        double B = sc.nextDouble();
        System.out.println("lado C");
        double C = sc.nextDouble();

        boolean cond1 = A < (B + C);
        boolean cond2 = B < (A + C);
        boolean cond3 = C < (A + B);

        if (cond1 && cond2 && cond3) {
            System.out.println("trinagulo vailido");
            if (A == B && B == C) {
                System.out.println("o trinagulo é equilatero");
            } else if (A == B || A == C || B == C) {
                System.out.println("o triangulo é isoceles");
            } else {
                System.out.println("o trinagulo é escaleno");
            }
        }else {
            System.out.println("triangulo invalido");
        }


    }
}
