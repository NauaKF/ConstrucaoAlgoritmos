import java.util.Scanner;

public class CalculoPares{
    public static void main(String[] args) {
        
        int valor = 0, i = 0, a = 0;
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o valor de parada: ");
        valor = scn.nextInt();

        for(i=0; i<=valor; i+=2){
                a += i;
                System.out.println("= " + a);        
        }
    }
}