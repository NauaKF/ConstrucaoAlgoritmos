import java.util.Scanner;

public class Inteiros{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int[] numInteiros = new int[5];
        int soma = 0, media = 0;

        for(int i = 0; i < numInteiros.length; i++){
            System.out.println("Digite o valor desejado: ");
            numInteiros[i] = scn.nextInt();

            soma += numInteiros[i];
        }

        media = soma / numInteiros.length;

        System.out.println("\nMedia = " + media);

    }
}