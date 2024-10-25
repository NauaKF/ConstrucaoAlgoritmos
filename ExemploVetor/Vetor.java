import java.util.Scanner;

public class Vetor{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int qtdNotas = 5;
        double[] notas = new double[qtdNotas];
        double media = 0.0;

        double notaTmp = 0.0;

        System.out.println("Digite as notas:");
        System.out.println();

        for(int i = 0; i < notas.length; i++){
            do{
                System.out.println("Digite a nota " + (i + 1) + " :");
                notaTmp = scn.nextDouble();
            }while(!(notaTmp >= 0 && notaTmp <= 10));

            notas[i] = notaTmp;
        }

        double soma = 0.0;

        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
        }

        media = soma / notas.length;
        System.out.println("\nMedia = " + media);
        System.out.println("As notas sao = ");
        for(int i = notas.length - 1; i >= 0; i--){
            System.out.println(notas[i]);
        }

        char[] vetorChar;
        String texto = "Qualquer coisa";

        vetorChar = new char[texto.length()];
        
        for(int i = 0; i < texto.length(); i++){
            vetorChar[i] = texto.charAt(i);
        }

        System.out.println(vetorChar);
    }
}