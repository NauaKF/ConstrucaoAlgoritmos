import java.util.Scanner;

public class Maior{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        double num = 0.0;
        double soma = 0.0;
        double resultado = 0.0;

        while(soma<=100){
            System.out.println("Digite o valor: ");
            num = scn.nextDouble();

            resultado = num;
            soma = resultado + soma;
        }
        System.out.println("\nSoma = " + soma);
    }
}