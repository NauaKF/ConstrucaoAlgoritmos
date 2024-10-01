import java.util.Scanner;

public class ConversaoS{
    public static void main(String[] args) {
        
        int escolha = 0;
        double num1 = 0.0, resultado = 0.0;

        Scanner scn = new Scanner(System.in);

        System.out.println("Digite a opcao que esta o numero: ");
        System.out.println("\n[1] Centimetros para Metros\n[2] Centimetros para Quilometros\n[3] Metros para Centimetros\n[4] Metros para Quilometros\n[5] Quilometros para Centimetros\n[6] Quilometros para Metros");
        escolha = scn.nextInt();

        switch(escolha){
            case 1:
            System.out.println("\nDigite o valor a ser convertido: ");
            num1 = scn.nextDouble();

            resultado = num1/100;

            System.out.println("\nResultado = " + resultado);
            break;

            case 2:
            System.out.println("\nDigite o valor a ser convertido: ");
            num1 = scn.nextDouble();

            resultado = num1/100000;

            System.out.println("\nResultado = " + resultado);
            break;

            case 3:
            System.out.println("\nDigite o valor a ser convertido: ");
            num1 = scn.nextDouble();

            resultado = num1*100;

            System.out.println("\nResultado = " + resultado);
            break;

            case 4:
            System.out.println("\nDigite o valor a ser convertido: ");
            num1 = scn.nextDouble();

            resultado = num1*1000;

            System.out.println("\nResultado = " + resultado);
            break;

            case 5:
            System.out.println("\nDigite o valor a ser convertido: ");
            num1 = scn.nextDouble();

            resultado = num1*100000;

            System.out.println("\nResultado = " + resultado);
            break;

            case 6:
            System.out.println("\nDigite o valor a ser convertido: ");
            num1 = scn.nextDouble();

            resultado = num1*1000;

            System.out.println("\nResultado = " + resultado);
            break;

            default:
            System.out.println("\nEscolha invalida!");
        }

    }
}