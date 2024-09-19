import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int auxiliar = 0;
        int i;
        int n;

        System.out.println("Esse programa e utilizado para demonstrar a sequencia de Fibonacci");
        System.out.println("Digite o numero desejado: ");
        n = scn.nextInt();

        for(i=0; i<n; i++){

            auxiliar = a;
            a = a + b;
            b = auxiliar;

            if(n == auxiliar){
                System.out.println("Sequencia de Fibonacci = " + auxiliar);
                System.out.println("O numero digitado pertence a sequencia de Fibonacci\n");
            }else{
                System.out.println("Sequencia de Fibonacci = " + auxiliar);
                System.out.println("O numero digitado nao pertence a sequencia de Fibonacci\n");
            }
        } 
    }
}