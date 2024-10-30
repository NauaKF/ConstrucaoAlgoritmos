import java.util.Scanner;

public class Vetor{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int[] maiorMenor = new int[5];
        int auxiliar = 0;

        for(int i = 0; i < maiorMenor.length; i++){
            System.out.println("Digite o valor desejado: ");
            maiorMenor[i] = scn.nextInt();
        }

        for(int i = 0; i < maiorMenor.length; i++){
            for(int j = 0; j < maiorMenor.length; j++){
                if(maiorMenor[i] < maiorMenor[j]){
                    auxiliar = maiorMenor[i];
                    maiorMenor[i] = maiorMenor[j];
                    maiorMenor[j] = auxiliar;                    
                }
            }
        }
        System.out.println("\nMaior numero = " + maiorMenor[4]);
        System.out.println("Menor numero = " + maiorMenor[0]);
    }
}