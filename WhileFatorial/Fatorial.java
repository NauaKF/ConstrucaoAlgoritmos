import java.util.Scanner;

public class Fatorial{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.println("Qual o valor do fatorial a ser calculado:");
        int valor = scn.nextInt();

        int fatorial = valor;
        int cont = valor-1;

        if(valor == 1 || valor == 0){
            fatorial = 1;
            System.out.println("\nFatorial = " + fatorial);
        }
        else if(valor > 1){
            while(cont>=1){
                fatorial = fatorial * cont;
                cont--;
            }
            System.out.println("\nFatorial: " + fatorial);
        }
        else{
            System.out.println("\nDigita direito");
        }

        
    }
}
        
        