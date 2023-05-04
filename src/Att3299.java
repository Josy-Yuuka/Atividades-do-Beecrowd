/*
Um número número 3 é de má sorte si contém um 1 seguido por um 3 entre seus dígitos. Por exemplo, o número 341329 é de má sorte, enquanto o número 26771 não é.

Dado um inteiro N, seu programa terá que determinar se N é azarado ou não.

resultado = dando runnetime error
*/

import java.util.Scanner;

public class Att3299{
    public static void main(String[] args) throws Exception {
        
        Scanner ler = new Scanner(System.in);
        
        int n = ler.nextInt();
        int azar = 13;

        if(String.valueOf(n).contains(String.valueOf(azar))){
            System.out.println(n + " es de Mala Suerte");
        }else{
            System.out.println(n+" NO es de Mala Suerte");
        }

        ler.close();
    }
}
