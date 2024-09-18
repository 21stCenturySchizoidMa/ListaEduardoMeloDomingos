package Lista03;

public class Exercicio35 {
    public static void main(String[] args) {

        for(int num = 1; num <= 100; num++) {
            if(num % 10 == 0){
                System.out.println(num + " é mutiplo de 10");
            }else{
                System.out.println(num);
            }
        }
    }
}
