import java.util.Scanner;

public class Vetor{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int qtd = 0;

        System.out.println("Digite a quantidade de numeros que deseja digitar: ");
        qtd = scn.nextInt();

        int[] somaImparPar = new int[qtd];
        int par = 0, impar = 0;

        for(int i = 0; i < somaImparPar.length; i++){
            System.out.println("Digite o numero desejado: ");
            somaImparPar[i] = scn.nextInt();

            if(somaImparPar[i] % 2 == 0){
                par += somaImparPar[i];
            }else{
                impar += somaImparPar[i];
            }
        }

        System.out.println("\nSoma dos numeros pares = " + par);
        System.out.println("Soma dos numeros impares = " + impar);
    }
}