import java.util.Scanner;

public class Altura{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        Double[] vetorAltura = new Double[5];
        double soma = 0.0, media = 0.0;

        for(int i = 0; i < vetorAltura.length; i++){
            System.out.println("Digite a altura desejada, ex: 1,71");
            vetorAltura[i] = scn.nextDouble();

            soma += vetorAltura[i];
        }

        media = soma / vetorAltura.length;

        System.out.println("\nAltura media = " + media + "m");
    }
}