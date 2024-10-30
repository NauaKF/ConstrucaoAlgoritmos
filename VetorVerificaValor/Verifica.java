import java.util.Scanner;

public class Verifica{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int[] posicaoVetor = new int[5];

        int procura = 0, cont = 0;

        for(int i = 0; i < posicaoVetor.length; i++){
            System.out.println("Digite o valor desejado: ");
            posicaoVetor[i] = scn.nextInt();
        }

        System.out.println("\nDigite o valor que deseja procurar no vetor: ");
        procura = scn.nextInt();

        for(int i = 0; i < posicaoVetor.length; i++){
            if(procura == posicaoVetor[i]){
                System.out.println("Valor encontrado na[s] posicao[oes] [" + i + "]");
                cont++;
            }
        }

        if(cont == 0){
            System.out.println("\nValor nao encontrado dentro do vetor!");
        }
    }
}