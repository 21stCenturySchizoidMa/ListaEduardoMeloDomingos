package Lista04;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite uma palavra");
        String palavra = sc.nextLine().replaceAll("[^a-z0-9]", "");
        System.out.println("essa palavra tem " + palavra.length() + " caracteres");

        String novaPalavra = palavra.toUpperCase();
        System.out.println(novaPalavra);

        int contador = 0;
        for(int i = 0; i < palavra.length(); i++){
            char letra = palavra.charAt(i);
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contador++;
            }
        }
        System.out.println("a palavra tem " + contador + " vogais");

        if(palavra.startsWith("UNI")){
            System.out.println("a palavra comeca com UNI");
        }else{
            System.out.println("a palavra nao comeca com uni");
        }
        if(palavra.endsWith("RIO")){
            System.out.println("a palavra termina com RIO");
        }else{
            System.out.println("a palavra nao termina com RIO");
        }

        int contador2 = 0;
        for(int i = 0; i < palavra.length(); i++){
            char digito = palavra.charAt(i);
            if(Character.isDigit(digito)){
                contador2++;
            }
        }
        System.out.println("a palavra tem " + contador2 + " digitos");

        boolean palindromo = true;
        int tamanho = palavra.length();
        for(int i  = 0; i < tamanho / 2; i++){
            if(palavra.charAt(i) != palavra.charAt(tamanho - 1 - i)){
                palindromo = false;
                break;
            }
        }
        if(palindromo){
            System.out.println("a palavra é um palindromo");
        }else{
            System.out.println("ela nao é um palindromo");
        }
    }
}
