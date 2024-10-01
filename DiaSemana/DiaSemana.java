import java.util.Scanner;

public class DiaSemana{
    public static void main(String[] args) {
        
        int dia = 0;

        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o dia da semana desejado: ");
        dia = scn.nextInt();

        switch(dia){
            case 1:
            System.out.println("\nSegunda-Feira");
            break;

            case 2:
            System.out.println("\nTerca-Feira");
            break;

            case 3:
            System.out.println("\nQuarta-Feira");
            break;

            case 4:
            System.out.println("\nQuinta-Feira");
            break;

            case 5:
            System.out.println("\nSexta-Feira");
            break;

            case 6:
            System.out.println("\nSabado");
            break;

            case 7:
            System.out.println("\nDomingo");
            break;

            default:
            System.out.println("\nOpcao invalida!");

        }
    }
}