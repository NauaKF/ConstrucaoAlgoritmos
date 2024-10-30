import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        char opcao;
        String saida = " ";
        double num1 = 0, num2 = 0;

        while(saida != "sim"){

            System.out.println("Digite a operacao desejada [+, -, /, *]: ");
            opcao = scn.next().charAt(0);

            switch(opcao){
                case '+':
                System.out.println("\nDigite o primeiro numero: ");
                num1 = scn.nextDouble();
                System.out.println("Digite o segundo numero: ");
                num2 = scn.nextDouble();

                System.out.println("Soma = " + (num1+num2));
                break;
                
                case '-':
                System.out.println("\nDigite o primeiro numero: ");
                num1 = scn.nextDouble();
                System.out.println("Digite o segundo numero: ");
                num2 = scn.nextDouble();

                System.out.println("Subtração = " + (num1-num2));
                break;

                case '/':
                System.out.println("\nDigite o primeiro numero: ");
                num1 = scn.nextDouble();
                System.out.println("Digite o segundo numero: ");
                num2 = scn.nextDouble();
                if(num2 == 0){
                    System.out.println("Digite um numero valido: ");
                    num2 = scn.nextDouble();
                }

                System.out.println("Divisão = " + (num1/num2));
                break;

                case '*':
                System.out.println("\nDigite o primeiro numero: ");
                num1 = scn.nextDouble();
                System.out.println("Digite o segundo numero: ");
                num2 = scn.nextDouble();

                System.out.println("Multiplicação = " + (num1*num2));
                break;
            }
            System.out.println("Deseja sair [SIM ou NAO]: ");
            saida = scn.nextLine();
        }
    }
}