import java.util.Scanner;

public class Crescente{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int[] vetorCrescente = new int[10];
        int auxiliar = 0;

        for (int i = 0; i < vetorCrescente.length; i++){

            System.out.println("Digite o valor desejado: ");
            vetorCrescente[i] = scn.nextInt();
        }

        for(int i = 0; i < vetorCrescente.length; i++){
            for(int j = 0; j < vetorCrescente.length; j++){

                if(vetorCrescente[i] < vetorCrescente[j]){
                    auxiliar = vetorCrescente[i];
                    vetorCrescente[i] = vetorCrescente[j];
                    vetorCrescente[j] = auxiliar;
                }
            }
        }

        System.out.println();

        for (int i = 0; i < vetorCrescente.length; i++){
            System.out.print("[" + vetorCrescente[i] + "]");
        }

        scn.close();
    }
}   