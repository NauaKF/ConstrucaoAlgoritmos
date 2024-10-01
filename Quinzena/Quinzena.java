import java.util.Scanner;

public class Quinzena{
    public static void main(String[] args) {
        
        int dia = 0;

        Scanner scn = new Scanner(System.in);

        System.out.println("Se o dia for de 01 a 15, digite 1\nSe o dia for de 16 a 30, digite 2: ");
        dia = scn.nextInt();

        switch(dia){
            case 1: 
            System.out.println("\nPrimeira Quinzena");
            break;

            case 2:
            System.out.println("\nSegunda Quinzena");
            break;

            default:
            System.out.println("\nErro! Tente novamente.");
        }
        
        
    }
}