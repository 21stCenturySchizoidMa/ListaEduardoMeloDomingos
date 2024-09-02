package LIsta01;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite o valor de A: ");
        int A = sc.nextInt();
        System.out.print("digite o valor de B: ");
        int B = sc.nextInt();
        System.out.print("digite o valor de C: ");
        int C = sc.nextInt();
        System.out.print("digite o valor de D: ");
        int D = sc.nextInt();

        int somaAB = A+B;
        int somaAC = A+C;
        int somaAD = A+D;
        int somaBC = B+C;
        int somaBD = B+D;
        int somaCD = C+D;

        int multAB = A*B;
        int multAC = A*C;
        int multAD = A*D;
        int multBC = B*C;
        int multBD = B*D;
        int multCD = C*D;

        System.out.println("somas:");
        System.out.println("A + B = " + somaAB);
        System.out.println("A + C = " + somaAC);
        System.out.println("A + D = " + somaAD);
        System.out.println("B + C = " + somaBC);
        System.out.println("B + D = " + somaBD);
        System.out.println("C + D = " + somaCD);

        System.out.println("\nmultiplicações:");
        System.out.println("A * B = " + multAB);
        System.out.println("A * C = " + multAC);
        System.out.println("A * D = " + multAD);
        System.out.println("B * C = " + multBC);
        System.out.println("B * D = " + multBD);
        System.out.println("C * D = " + multCD);

        sc.close();
    }
}
