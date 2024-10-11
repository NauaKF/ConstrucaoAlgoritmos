
import java.util.Scanner;

public class Fatorial{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Qual o valor do fatorial a ser calculado:");
        int valor = scn.nextInt();

        int fatorial = valor;

        if(valor > 1){
            for(int cont = valor - 1; cont >= 1; cont--){

                fatorial = fatorial * cont;
    
            }
            System.out.println("Fatorial: " + fatorial);
        }else if(valor == 1 || valor == 0){
            fatorial = 1;
            System.out.println("Fatorial: " + fatorial);
        }else{
            System.out.println("Digita direito");
        }

        

        



    }
}