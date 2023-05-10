import java.util.Scanner;

public class Att1066{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int par = 0, impar = 0, pos = 0, neg = 0;

        for( int i = 0; i < 5; i++){

            int num = ler.nextInt();

            if(num % 2 == 0){
                 par++;
            } else{
                impar++;
            }
            if(num > 0){
                pos++;
            }else
                if(num < 0){
                neg++;
            }

        }

        System.out.println( par + " valor(es) par(es)\n" +
                            impar + " valor(es) impar(es)\n" + 
                            pos++ + " valor(es) positivo(s)\n"+
                            neg++ + " valor(es) negtivo(s)\n");

    }

}