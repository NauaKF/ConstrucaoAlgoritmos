import java.util.Scanner;

public class Nomes{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        String[] nomes = new String[10];

        for(int i = 0; i < nomes.length; i++){
            System.out.println("Digite o nome desejado: ");
            nomes[i] = scn.next();
        }

        System.out.println();

        for(int i = nomes.length-1; i >= 0; i--){
            System.out.println("[" + nomes[i] + "]");
        }
    }
}