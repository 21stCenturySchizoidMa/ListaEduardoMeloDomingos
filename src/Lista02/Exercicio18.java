package Lista02;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um codigo entre 1 e 3: ");
        int codigo = sc.nextInt();

        boolean condicao1 = codigo >=4;
        boolean condicao2 = codigo <=0;
        //crio uma condiçao true or false para verificar se a exigencia esta sendo respeitada, caso nao esteja ele exibe a mensagem de codigo invalido, porem caso o codigo esteja dentro do criterio ele roda o programa
        if(condicao1 || condicao2){
            System.out.println("codigo invalido");
        } else if (codigo == 1) {
            System.out.println("um");
        }else if (codigo == 2) {
            System.out.println("dois");
        }else {
            System.out.println("tres");
        }
    }
}
