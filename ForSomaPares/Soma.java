import java.util.Scanner;

public class Soma{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int i = 0, n = 0, aux = 0, resultado = 0;


        System.out.println("Digite o valor maximo: ");
        n = scn.nextInt();

        for(i=0; i<=n; i+=2){
            aux = i;
            resultado += aux;
        }
        System.out.println("\nSoma final = " + resultado);
    }
}