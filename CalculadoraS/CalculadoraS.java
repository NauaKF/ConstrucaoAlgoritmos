import java.util.Scanner;

public class CalculadoraS{
    public static void main(String[] args) {
        
        int escolha = 0;
        double num1 = 0.0, num2 = 0.0, resultado = 0.0;

        Scanner scn = new Scanner(System.in);

        System.out.println("[1] Adicao\n[2] Subtracao\n[3] Multiplicacao\n[4] Divisao");
        escolha = scn.nextInt();

        switch(escolha){
            case 1:
            System.out.println("\nDigite o primeiro valor: ");
            num1 = scn.nextDouble();
            System.out.println("Digite o segundo valor: ");
            num2 = scn.nextDouble();

            resultado = num1+num2;

            System.out.println("\nResultado = " + resultado);
            break;

            case 2:
            System.out.println("\nDigite o primeiro valor: ");
            num1 = scn.nextDouble();
            System.out.println("Digite o segundo valor: ");
            num2 = scn.nextDouble();

            resultado = num1-num2;

            System.out.println("\nResultado = " + resultado);
            break;

            case 3:
            System.out.println("\nDigite o primeiro valor: ");
            num1 = scn.nextDouble();
            System.out.println("Digite o segundo valor: ");
            num2 = scn.nextDouble();

            resultado = num1*num2;

            System.out.println("\nResultado = " + resultado);
            break;

            case 4:
            System.out.println("\nDigite o primeiro valor: ");
            num1 = scn.nextDouble();
            System.out.println("Digite o segundo valor: ");
            num2 = scn.nextDouble();

            resultado = num1/num2;

            System.out.println("\nResultado = " + resultado);
            break;

            default:
            System.out.println("\nEscolha invalida!");
        }

    }
}