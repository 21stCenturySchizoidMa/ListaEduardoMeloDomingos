package Lista03;

public class Exercicio43 {
    public static void main(String[] args) {
        final int NUM_QUADRADOS = 64;
        long totalGranos = 0;
        long granosNoQuadrado = 1;

        for (int i = 0; i < NUM_QUADRADOS; i++) {
            totalGranos += granosNoQuadrado;
            granosNoQuadrado *= 2;
        }

        System.out.println("O número total de grãos de trigo é: " + totalGranos);
    }
}

